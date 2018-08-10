package com.cg.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.beans.Product;

@Repository
public interface ProductRepoInterface extends CrudRepository<Product,Integer>{

}
