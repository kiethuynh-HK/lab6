package com.example.lab.service;

import com.example.lab.entity.Product;
import com.example.lab.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List<Product> GetAll(){return (List<Product>) repo.findAll();}
    public void add(Product newProduct) {repo.save(newProduct);}
}
