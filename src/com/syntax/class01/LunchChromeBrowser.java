package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
          WebDriver driver=new ChromeDriver();
         // Thread.sleep(3000);
         // driver.close();
          
          driver.get("https://www.google.com");
          
          
         String url= driver.getCurrentUrl();
         
         System.out.println(url);
         
        System.out.println( driver.getTitle());
        
        
        driver.close();
	}

}
