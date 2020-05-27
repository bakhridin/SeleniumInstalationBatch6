package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpethDemo {
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		 WebDriver driver=new ChromeDriver();
		 
		
	  driver.get(url);
	  
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	 // driver.close();
	 // driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).click();//contains();
	  driver.findElement(By.xpath("//a[contains(@id,'menu_pim_viewPimModule')]")).click();
	  
	  driver.findElement(By.xpath("//a[starts-with(text(),'Log')]")).click();
	  
	 // Thread.sleep(3000);
	  
	  
	  

	}

}
