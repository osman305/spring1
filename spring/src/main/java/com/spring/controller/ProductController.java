package com.spring.controller;

import com.spring.entity.Product;
import com.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private String rockSolid;
    @Autowired
    private String getMyProperty;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping("/profile")
    public String getProfile(){
        return rockSolid
                + " --- " + getMyProperty;
    }
}
