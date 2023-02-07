package com.hangnt169.it17203.B8_JPA.service.impl;

import com.hangnt169.it17203.B8_JPA.entity.Category;
import com.hangnt169.it17203.B8_JPA.repository.CategoryRepository;
import com.hangnt169.it17203.B8_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hangnt169
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category searchCategory(String categoryCode, String categoryName) {
        return categoryRepository.findByCategoryCodeAndCategoryName(categoryCode, categoryName);
//        return categoryRepository.search1(categoryCode, categoryName);
//        return categoryRepository.search2(categoryCode, categoryName);
//        return categoryRepository.search3(categoryCode, categoryName);
//        return categoryRepository.search4(categoryCode, categoryName);
    }
}
