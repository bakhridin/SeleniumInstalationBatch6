package com.syntax.hw;

import com.syntax.utils.BaseClass;

public class TestClass extends BaseClass{

	public static void main(String[] args) throws InterruptedException  {
		
		setUp();
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(3000);
		
		tearDown();
		
		

	}

}
