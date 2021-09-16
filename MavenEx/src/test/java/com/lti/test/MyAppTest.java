package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.Myapp;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

//	@Test
//	void testshow() {
//		Myapp m=new Myapp();
//		String s=m.show();
//		Assertions.assertEquals("hello maven",s);
//	}
	
	@Test
	void testAdd() {
		int r=Calculator.add(100, 200);
		//expected , actual
		Assertions.assertEquals(300,r);
		//Assertions.assertEquals(100,Calculator.add(100, 2000));
		Assertions.assertNotEquals(100,r);
	}
	//@Test
//	 void testAssertAll() {
//		String str1="abc";
//		String str2="xyz";
//		Assertions.assertAll(
//				() -> Assertions.assertEquals(str2, "xyz"),
//				() -> Assertions.assertEquals(str1, "abc")
//				
//				);
//	}
//	
//	@Test
//	void testCollections() {
//		ArrayList<String> list=new ArrayList<>();
//		list.add("rishi");
//		Assertions.assertFalse(list.isEmpty());
//		
//	}
}
