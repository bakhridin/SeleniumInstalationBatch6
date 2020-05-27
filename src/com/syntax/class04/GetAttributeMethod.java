package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		WebElement userName=driver.findElement(By.name("txtUsername"));
		
		  userName.sendKeys("Admin");
		  
		  String txt=userName.getAttribute("value");
		  
		     System.out.println(txt);
		     
		     driver.quit();

	}

}
