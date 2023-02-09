package com.hangnt169.it17203.B8_JPA.controller;

import com.hangnt169.it17203.B8_JPA.entity.Category;
import com.hangnt169.it17203.B8_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hangnt169
 */
@RestController
public class Category1Controller {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("api/hien-thi1")
    public Page<Category> getAll(
            @RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo) {
        Integer size = 5;
        return categoryService.getAll(pageNo, size);
    }
}
