package com.cg.spring.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.beans.Product;
import com.cg.spring.boot.repository.ProductRepoInterface;

@Service
public class ProductServiceImpl implements ProductServiceInterface {

	@Autowired
	private ProductRepoInterface repo;
	
	public Optional<Product> getProductById(int id)
	{
		return repo.findById(id);
	}
	
}
