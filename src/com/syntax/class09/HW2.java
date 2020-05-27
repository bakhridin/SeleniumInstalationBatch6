package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;



public class HW2 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement el1=driver.findElement(By.id("txtUsername"));
		
		sendText(el1,"Admin");
		
		

	}

}
