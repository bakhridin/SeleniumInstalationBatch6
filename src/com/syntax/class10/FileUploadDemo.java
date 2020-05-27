package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {
	 
		String filePath="/Users/macbook/Desktop/myfile.png";

		
	String url="https://the-internet.herokuapp.com";
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.linkText("File Upload")).click();
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("file-submit")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
