package com.hangnt169.it17203.B8_JPA.service;

import com.hangnt169.it17203.B8_JPA.entity.Category;

import java.util.List;

/**
 * @author hangnt169
 */
public interface CategoryService {

    List<Category>getAll();

    Category searchCategory(String categoryCode,String categoryName);

}
