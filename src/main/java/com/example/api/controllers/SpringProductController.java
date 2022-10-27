package com.example.api.controllers;

import com.example.api.entities.SpringProductEntity;
import com.example.api.entities.SpringUsersEntity;
import com.example.api.services.SpringProductService;
import com.example.api.services.SpringUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpringProductController {
    @Autowired
    SpringProductService productService;

    @RequestMapping(value = "product", method = RequestMethod.GET)
    public ResponseEntity<List<SpringProductEntity>> findAll() {
        List<SpringProductEntity> allProducts = productService.getAllProducts();
        if(allProducts.size() == 0) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @RequestMapping(value = "product", method = RequestMethod.POST)
    public ResponseEntity<SpringProductEntity> saveNewUser(@RequestBody SpringProductEntity p) {
        productService.addProduct(p);
        return new ResponseEntity<SpringProductEntity>(p, HttpStatus.OK);
    }

}
