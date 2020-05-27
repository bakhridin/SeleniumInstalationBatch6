package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("email")).sendKeys("Username");
		driver.findElement(By.name("password")).sendKeys("Name1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("Name1234");
		driver.findElement(By.name("register")).click();


	}

}
