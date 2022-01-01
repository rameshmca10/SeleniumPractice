package week5.day1;

import org.testng.annotations.Test;

public class Attributes {

	@Test(invocationCount = 2, threadPoolSize = 2, priority = -1,enabled=true)
	public void createLead1() {
		System.out.println("create Lead -1");
		throw new RuntimeException();
	}

	@Test(priority = 3, threadPoolSize = 5, dependsOnMethods = "createLead1")
	public void createLead2() {
		System.out.println("create Lead 2");
	}

	@Test(priority = 1,timeOut = 5000)
	public void createLead3() {
		System.out.println("create Lead 3");
	}

	@Test(enabled = false, priority = 5)
	public void createLead4() {
		System.out.println("create Lead no priority");
	}

}