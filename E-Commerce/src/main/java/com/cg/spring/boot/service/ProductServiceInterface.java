package com.cg.spring.boot.service;

import java.util.Optional;

import com.cg.spring.boot.beans.Product;

public interface ProductServiceInterface 
{
   public Optional<Product> getProductById(int id);
}
