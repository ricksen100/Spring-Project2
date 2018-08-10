package com.cg.spring.boot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.beans.Product;
import com.cg.spring.boot.service.ProductServiceImpl;
import com.cg.spring.boot.service.ProductServiceInterface;




@RestController
public class ProductController {

	@Autowired
	ProductServiceInterface service;
	@RequestMapping("/getproducts")
	public Optional<Product> getProductById(@RequestParam String id)
	{
		return service.getProductById(Integer.parseInt(id));
	}
}
