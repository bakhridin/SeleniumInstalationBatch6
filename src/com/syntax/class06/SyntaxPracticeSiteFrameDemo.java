package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		driver.switchTo().frame("FrameOne");
		
		boolean logoIsDis=driver.findElement(By.id("hide")).isDisplayed();
		
		System.out.println(" Logo is displayed "+logoIsDis);
		

	}

}
