package com.syntax.class02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigDemo {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbook/eclipse-workspace/SeleniumInstalation/drivers/chromedriver");
		        
		   
		    
FileInputStream fis=new FileInputStream("/Users/macbook/eclipse-workspace/SeleniumInstalation/configurations/Variables.properties");
         
            Properties pro=new Properties();
            pro.load(fis);
            
//            String str=pro.getProperty("browser");
//            System.out.println(str);
            
            
            if(pro.getProperty("browser").equals("chrome")) {
            
            	driver=new ChromeDriver();
            
            }
            
            driver.get(pro.getProperty("url"));
            
            driver.findElement(By.name("email")).sendKeys(pro.getProperty("userName"));
            driver.findElement(By.name("pass")).sendKeys(pro.getProperty("password"));
            
            driver.findElement(By.id("loginbutton")).click();
            
	}

}
