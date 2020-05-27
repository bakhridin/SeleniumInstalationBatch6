package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {
	
	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.xpath("//input[contains(@id,'ctl00_MainContent_username')]"));
		userName.clear();   
		userName.sendKeys("Tester");
		Thread.sleep(3000);
		
		
		WebElement pass=driver.findElement(By.cssSelector("input[name*='Content$password']"));
		
		    pass.clear();
		    Thread.sleep(2000);
		    pass.sendKeys("test");
		    
		    WebElement loginBtn=driver.findElement(By.cssSelector("input[value='Login']"));
		    
		    loginBtn.click();
		    
		    Thread.sleep(3000);
		    
		    boolean isLogoDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		    
		          if(isLogoDisplayed) {
		        	  System.out.println("Logo is Diplayed, Test Case passed");
		          }else {
		        	  System.out.println("Logo is NOT Diplayed, Test Case failed");
		          }
		          
		          WebElement loginInfo= driver.findElement(By.xpath("//div[@class='login_info']"));
		          
		             String text=loginInfo.getText();
		             
		               if(text.contains("Tester")) {
		            	   System.out.println("User Successfully logged in ,Test Case passed");
		               }else {
		            	   System.out.println("User Successfully NOT logged in ,Test Case failed");
		               }
		    
		    
		driver.quit();

	}

}
