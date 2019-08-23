package com.how2java.test;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.service.TestInterface;
import com.how2java.service.impl.TestInterfaceImpl;
import com.how2java.util.RedisUtil;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//public class TestSpring {
//	@Autowired
//	Category c;
//
//	@Autowired
//	TestInterface testInterface;
//	
//	@Test
//	public void test() {
//
//		testInterface.show();
//		
//		Locale l = Locale.getDefault();
//
//		System.out.println(c.getName());
//	}
//
//	@Test
//	public void test2() {
//		System.out.println(c.getId());
//	}
//}

public class TestSpring {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		

		

		

		TestInterface sss = (TestInterface) context.getBean("testInterfaceImpl");
//		TestInterface sss=(TestInterface)context.getBean("ts");
//		sss.show();

		// new TestService().dos();

		Category c = (Category) context.getBean("c");

		Product p = (Product) context.getBean("p");
		System.out.println(p.getName() + ";" + p.getCategory().getName());

		ProductService s = (ProductService) context.getBean("s");
		s.doSomeService();
	}
}
