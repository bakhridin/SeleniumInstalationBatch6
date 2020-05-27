package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
     
        driver.get("http://test:test@abcdatabase.com/basicauth/");
        
        // Thread.sleep(3000);
        // driver.close();
         
	}

}
