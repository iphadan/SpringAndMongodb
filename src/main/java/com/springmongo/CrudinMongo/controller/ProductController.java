package com.springmongo.CrudinMongo.controller;

import com.springmongo.CrudinMongo.product.Product;
import com.springmongo.CrudinMongo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;
    @PostMapping
    public ResponseEntity<String> save(@RequestBody Product product){

        return ResponseEntity.ok(service.save(product));
    }
    @GetMapping
    public ResponseEntity<List<Product> >findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/findById/{product_id}")
    public ResponseEntity<Product> findById(@PathVariable("product_id") String id){
        return ResponseEntity.ok(service.findById(id));
    }
    @DeleteMapping("/delete/{product_id}")

    public ResponseEntity<Void> delete(@PathVariable("product_id") String id){
        service.delete(id);
        return ResponseEntity.accepted().build();
    }
}
