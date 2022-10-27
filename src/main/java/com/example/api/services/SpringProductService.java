package com.example.api.services;


import com.example.api.entities.SpringProductEntity;

import java.util.List;

public interface SpringProductService {
    public void addProduct(SpringProductEntity p);
    public void sellProduct(Integer productId, Integer quantity);
    public List<SpringProductEntity> getAllProducts();
}
