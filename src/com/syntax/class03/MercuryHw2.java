package com.syntax.class03;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryHw2 {
	public static String url="http://newtours.demoaut.com/";

	public static void main(String[] args) {
		//Using ss ONLY
		//TC 2: Mercury Tours Registration: 
		//	Open chrome browser
		//	Go to “http://newtours.demoaut.com/”
		//	Click on Register Link
		//	Fill out all required info (skip dropdowns)
		//	Click Submit
		//	User successfully registered
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		    WebDriver driver=new FirefoxDriver();
		    
		    driver.get(url);
		    
	    driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Ahmad");
		    driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Ahmad1234");
//		    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Ahmad1234");
//		    driver.findElement(By.xpath("//input[@name='register']")).click();
	

	}

}
