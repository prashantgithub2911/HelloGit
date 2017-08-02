package com.pk.test.git;

import com.pk.Git.TestClass;

public class JUnitTestClass {
	
	
	public void testAddition() throws Exception {
		System.out.println("Calling addition....");
		TestClass tc = new TestClass();
		int res = tc.addition(5, 10);
		System.out.println(" Addition result = "+res);
		
	}
	
}
