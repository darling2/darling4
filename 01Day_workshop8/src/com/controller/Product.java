package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String productName;
	String productId;
	int num;
	
    public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Product(String productName, String productId, int num) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.num = num;
	}


	public Product() {
        super();
    }

	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", num=" + num + "]";
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
