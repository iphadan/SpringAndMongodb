package com.springmongo.CrudinMongo.service;

import com.springmongo.CrudinMongo.product.Product;
import com.springmongo.CrudinMongo.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public String save(Product product){
        //we use Dto and there must be some validation method
        return productRepo.save(product).toString();
    }
    public Product findById(String id){
        return productRepo.findById(id).orElse(null);
    }
    public List<Product> findAll(){
        return productRepo.findAll();
    }
    public void delete(String id){
        productRepo.deleteById(id);
    }
}
