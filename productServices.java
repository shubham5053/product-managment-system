package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class productServices {

	@Autowired
	productDao dao;
	// @Autowired
	// ProductController pd;

	public ArrayList<product> getdatafromdao() {

		ArrayList<product> product = dao.getDataformDB();
		System.out.println("i am in service");
		return product;

	}

	public product getdatafromdao(String productid) {

		product product = null;

		if (productid.equals("productid")) {
			product = dao.getDataformDB(productid);

		}

		product = dao.getDataformDB(productid);

		System.out.println("i am in service");
		return product;

	}

	public List<product> addproduct(product product) {

		System.out.println(product);
		return dao.addproduct(product);

	}

	public List<product> updateproduct(product product) {

		return dao.updateproduct(product);

	}

	public List<product> deletebookdata(String productid) {
		return dao.deleterecord(productid);

	}

}