package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

	@Autowired
	productServices service;

	@GetMapping("showproduct")
	public ArrayList<product> showproduct() {
		System.out.println("hello");
		ArrayList<product> product = service.getdatafromdao();
		return product;

	}

	@GetMapping("showproduct/{productid}")
	public product show(@PathVariable String productid) {
		System.out.println("hello");

		product product = service.getdatafromdao(productid);
		System.out.println(product);

		return product;

	}

	// insert data
	@PostMapping("add")
	public List<product> add(@RequestBody product product) {
		System.out.println(product);
		return service.addproduct(product);

	}

	// update product record
	@PutMapping("update/{productid}")
	public List<product> updateproduct(@RequestBody product product) {

		return service.updateproduct(product);

	}

	@DeleteMapping("delete/{productid}")
	public List<product> deletebook(@PathVariable String productid) {

		return service.deletebookdata(productid);

	}

}