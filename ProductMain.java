package com.springOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("ProductDetail.xml");
	ProductBean objone=(ProductBean) context.getBean("ProductOne");
	objone.displayBean();
	

	}

}
