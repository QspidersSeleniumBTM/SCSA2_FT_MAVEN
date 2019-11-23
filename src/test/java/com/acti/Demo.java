package com.acti;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void runTest() {
		Reporter.log("Test Runner1 Msg",true);
	}
	
	@Test
	public void runTest1() {
		Reporter.log("Test Runner2 Msg",true);
	}
	
	
	
	@Test
	public void runTest2() {
		Reporter.log("Test Runner2 Msg",true);
	}
}
