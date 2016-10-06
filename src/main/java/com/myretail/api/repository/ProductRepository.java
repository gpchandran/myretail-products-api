package com.myretail.api.repository;

import com.myretail.api.domain.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Product entity.
 */
@SuppressWarnings("unused")
public interface ProductRepository extends MongoRepository<Product,String> {

}
