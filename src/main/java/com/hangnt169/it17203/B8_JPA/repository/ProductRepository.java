package com.hangnt169.it17203.B8_JPA.repository;

import com.hangnt169.it17203.B8_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hangnt169
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
