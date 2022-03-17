package com.spring.service;

import com.spring.entity.Product;
import com.spring.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private MyRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public Product getById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getByName(String name) {
        return repository.findByName(name);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product deleted";
    }
}
