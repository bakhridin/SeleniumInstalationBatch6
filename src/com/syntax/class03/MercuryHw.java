package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryHw {
	public static String url="http://newtours.demoaut.com/";

	public static void main(String[] args) {
		//Using xPath ONLY
		//TC 2: Mercury Tours Registration: 
		//	Open chrome browser
		//	Go to “http://newtours.demoaut.com/”
		//	Click on Register Link
		//	Fill out all required info (skip dropdowns)
		//	Click Submit
		//	User successfully registered
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		    WebDriver driver=new ChromeDriver();
		    
		    driver.get(url);
		    
		    driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ahmad");
		    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Ahmad1234");
		    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Ahmad1234");
		    driver.findElement(By.xpath("//input[@name='register']")).click();
	

	}

}
