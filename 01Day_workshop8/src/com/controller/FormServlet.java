package com.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		HashMap<String, Product> products = new HashMap<>();
		//해시맵은 인스턴스 변수로!
		//한번만 생성되니깐 공유할 수 있게
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name= request.getParameter("productName");
		String id= request.getParameter("productId");
		int num= Integer.parseInt(request.getParameter("num"));
		
		Product temp = products.get(id); //id는 키 값
		//temp는 Product클래스임 
		
		if(temp==null) {
			temp =new Product(name,id,num);
			//값이 계속 계속 쌓이니깐 new 객체 생성을 해줘야함!!
			
			products.put(id,temp);
			//아이디 값과, Product클래스를 넣어줌.
		}else {
			temp.setNum(num);
			
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
