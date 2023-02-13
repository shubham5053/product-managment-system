package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product {

	@Id
	String productid;
	String productname;
	String productprice;
	String productquantity;
	String productcategory;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(String productid, String productname, String productprice, String productquantity,
			String productcategory) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productquantity = productquantity;
		this.productcategory = productcategory;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public String getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	@Override
	public String toString() {
		return "product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productquantity=" + productquantity + ", productcategory=" + productcategory + "]";
	}

	

}
