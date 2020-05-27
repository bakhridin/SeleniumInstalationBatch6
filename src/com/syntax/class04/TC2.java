package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		WebElement usnam=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		 usnam.clear();
		usnam.sendKeys("Admin");
		
		
       WebElement pwd= driver.findElement(By.xpath("//input[@id='txtPassword']"));
       pwd.clear();
        pwd.sendKeys("Hum@nhrm123");
        Thread.sleep(3000);
          pwd.clear();
          
        WebElement lbt= driver.findElement(By.xpath("//input[@class='button']"));
        lbt.click();
      Thread.sleep(3000);
         String strLBT=lbt.getText();
         System.out.println(strLBT);
         if(strLBT.isEmpty()) {
        	 System.out.println("Password can not be empty, please fill it");
         }
         Thread.sleep(3000);
     driver.quit();
	}

}
