package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class productDao {
	@Autowired
	SessionFactory factory;

	public ArrayList<product> getDataformDB() {
		Session session = factory.openSession();
		product product1 = session.load(product.class, "p1");
		Criteria criteria = session.createCriteria(product.class);
		ArrayList<product> al = (ArrayList<product>) criteria.list();
		System.out.println("i am in dao");
		return al;

	}

	public product getDataformDB(String productid) {
		Session session = factory.openSession();
		product product1 = session.load(product.class, productid);
		System.out.println(product1);
		// Criteria criteria = session.createCriteria(Product.class);
		// ArrayList<Product> al = (ArrayList<Product>) criteria.list();
		System.out.println("i am in dao");
		return product1;

	}

	public List<product> addproduct(product product) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.getTransaction();
		session.save(product);

		tx.commit();
		tx.rollback();
		Criteria crite = session.createCriteria(product.class);
		List<product> lb = (List<product>) crite.list();
		session.close();
		System.out.println("record inserted successfully");
		return lb;

	}

	public List<product> updateproduct(product product) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.getTransaction();
		product product1 = session.load(product.class, "p1");
		// System.out.println(product1);

		// product1.setProductid(product.productid);
		product1.setProductname(product.productname);
		product1.setProductprice(product.productprice);
		// product1.setProductquantity(product.productquantity);
		// product1.setProductcategory(product.productcategory);

		session.update(product1);
		session.save(product1);

		Criteria crite = session.createCriteria(product.class);
		List<product> lb = (List<product>) crite.list();
		tx.commit();
		System.out.println("record update successfully");
		return lb;

	}

	public List<product> deleterecord(String productid) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.getTransaction();
		product product1 = session.load(product.class, productid);
		session.delete(product1);
		Criteria crite = session.createCriteria(product.class);
		List<product> lb = (List<product>) crite.list();
		tx.commit();
		System.out.println("Record delete Successfully");
		return lb;

	}
}