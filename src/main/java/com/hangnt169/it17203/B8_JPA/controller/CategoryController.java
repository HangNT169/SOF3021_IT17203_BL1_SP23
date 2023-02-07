package com.hangnt169.it17203.B8_JPA.controller;

import com.hangnt169.it17203.B8_JPA.entity.Category;
import com.hangnt169.it17203.B8_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author hangnt169
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/hien-thi")
    public String hienThiDanhSachCategory(Model model){
        List<Category>categoryList = categoryService.getAll();
        model.addAttribute("categories",categoryList);
        return "buoi8/buoi8";
    }

    @GetMapping("/category/search")
    @ResponseBody
    public Category searchCategory(@RequestParam("code")String categoryCode,
                                   @RequestParam("name")String categoryName){
        Category cate = categoryService.searchCategory(categoryCode, categoryName);
        return cate;
    }
}
