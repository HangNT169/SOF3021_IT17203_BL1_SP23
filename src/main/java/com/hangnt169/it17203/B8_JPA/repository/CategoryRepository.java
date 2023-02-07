package com.hangnt169.it17203.B8_JPA.repository;

import com.hangnt169.it17203.B8_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hangnt169
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    //Query Creation
    Category findByCategoryCodeAndCategoryName(String categoryCode, String categoryName);

    // @Query
    // JPQL ( JPA Query Langage)
    @Query("SELECT  c FROM Category c WHERE c.categoryCode  = ?2 AND c.categoryName =?1")
    Category search1(String categoryName, String categoryCode);

    @Query("SELECT  c FROM Category c WHERE c.categoryCode  =:code AND c.categoryName =:name")
    Category search2(@Param("name") String categoryName, @Param("code") String categoryCode);

    // raw sql = native = true
    @Query(value = "SELECT * FROM category c WHERE c.category_name =:name AND c.category_code =:code", nativeQuery = true)
    Category search3(@Param("name") String categoryName, @Param("code") String categoryCode);

    @Query(value = "SELECT * FROM category c WHERE c.category_name =?1 AND c.category_code =?2", nativeQuery = true)
    Category search4(String categoryName, String categoryCode);
}
