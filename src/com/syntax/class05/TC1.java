package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
	   
		
		setUp();
		
		WebElement monthDD=driver.findElement(By.id("month"));
		
		  Select select=new Select(monthDD);

	}

}
