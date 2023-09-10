package com.yohanaff.github.productservice.repository;

import com.yohanaff.github.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {

}
