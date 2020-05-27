package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username,ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password,ConfigsReader.getProperty("password"));
		
		Thread.sleep(2000);
		tearDown();
		
  
	}

}
