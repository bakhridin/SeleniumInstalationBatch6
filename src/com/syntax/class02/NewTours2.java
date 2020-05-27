package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTours2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com//");
		
		
		
		Actions abc = new Actions (driver);
		
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		abc.moveToElement(element).build().perform();
	}

}
