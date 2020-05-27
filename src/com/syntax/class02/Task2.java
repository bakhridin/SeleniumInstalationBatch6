package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Ahmad");
		
		driver.findElement(By.id("u_0_o")).sendKeys("Sarmed");
		
		driver.findElement(By.name("reg_email__")).sendKeys("3233244332");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ahmed1234");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("u_0_13")).click();
		
		driver.quit();

	}

}
