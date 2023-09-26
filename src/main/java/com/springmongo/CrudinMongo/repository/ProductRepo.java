package com.springmongo.CrudinMongo.repository;

import com.springmongo.CrudinMongo.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo  extends MongoRepository<Product ,String> {
}
