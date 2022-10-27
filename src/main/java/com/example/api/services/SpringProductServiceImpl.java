package com.example.api.services;

import com.example.api.entities.SpringProductEntity;
import com.example.api.repositories.SpringProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringProductServiceImpl implements SpringProductService {
    @Autowired
    SpringProductRepository productRepository;


    @Override
    public void addProduct(SpringProductEntity p) {
        productRepository.save(p);
    }

    @Override
    public void sellProduct(Integer productId, Integer quantity) {

    }

    @Override
    public List<SpringProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}
