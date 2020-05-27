package com.Selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTestSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
		WebElement element1=driver.findElement(By.xpath("//input[@id='email']"));
		
		element1.clear();
		element1.sendKeys("Ahmad");
		
		WebElement element2=driver.findElement(By.cssSelector("input[name='pass']"));
		
		element2.clear();
		element2.sendKeys("Ismoil");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		WebElement element3=driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		
		String forgotText=element3.getText();
		System.out.println(forgotText);
		
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		WebElement element4=driver.findElement(By.xpath("//input[@id='u_0_m']"));
		element4.clear();
		element4.sendKeys("John");
		
		WebElement el5=driver.findElement(By.cssSelector("input[name='lastname']"));
		el5.clear();
		el5.sendKeys("Smith");
		
	 	WebElement el6=driver.findElement(By.cssSelector("input[id='u_0_r']"));
		el6.clear();
		el6.sendKeys("323-243-2233");
		
		WebElement el7=driver.findElement(By.cssSelector("input[id='u_0_w']"));
		el7.clear();
		el7.sendKeys("Smith1234");
		
		
		
		
		//driver.quit();

	}

}
