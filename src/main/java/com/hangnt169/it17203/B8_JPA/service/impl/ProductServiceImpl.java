package com.hangnt169.it17203.B8_JPA.service.impl;

import com.hangnt169.it17203.B8_JPA.dto.ViewProduct;
import com.hangnt169.it17203.B8_JPA.entity.Product;
import com.hangnt169.it17203.B8_JPA.repository.ProductRepository;
import com.hangnt169.it17203.B8_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt169
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public List<ViewProduct> hienThiDanhSachProduct() {
        List<Product>products = repository.findAll();
        List<ViewProduct> viewProducts = new ArrayList<>();
        // Mapping ViewProduct Product
        for(Product p:products){
            // mapping
            ViewProduct viewProduct = new ViewProduct();
            viewProduct.setProductName(p.getProductName());
            // ...
            // add vao view products
            viewProducts.add(viewProduct);
        }
        return viewProducts;
    }
//  https://github.com/HangNT169/HangHibernate/blob/master/src/main/java/com/fpt/poly/hangnt/service/impl/ProductServiceImpl.java
// https://github.com/HangNT169/HangHibernate_CustomModel/blob/master/src/main/java/com/fpt/poly/hangnt/repository/ProductRepository.java
}
