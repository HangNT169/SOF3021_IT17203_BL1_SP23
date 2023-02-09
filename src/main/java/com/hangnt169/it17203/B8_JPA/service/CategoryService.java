package com.hangnt169.it17203.B8_JPA.service;

import com.hangnt169.it17203.B8_JPA.entity.Category;
import org.springframework.data.domain.Page;

/**
 * @author hangnt169
 */
public interface CategoryService {

    Page<Category> getAll(Integer pageNo,Integer size);

    Category searchCategory(String categoryCode, String categoryName);

}
