package com.Selenium.test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
			WebElement ddMonth=driver.findElement(By.xpath("//select[@id='month']"));
		
			Select select1=new Select(ddMonth);
			
			select1.selectByVisibleText("Apr");
			
			WebElement day=driver.findElement(By.id("day"));
			
			Select select2=new Select(day);
			
			List<WebElement> listdd=select2.getOptions();
			
			
			
			for (WebElement list : listdd) {
				String text=list.getText();
				//System.out.println(text);
				
				
				if(text.equals("25")) {
					list.click();
				}
				
			}
			
			WebElement yeardd=driver.findElement(By.id("year"));
			Select select3=new Select(yeardd);
			
			select3.selectByValue("1990");
			
			
			List<WebElement> radioBn=driver.findElements(By.xpath("//label[@class='_58mt']"));
		
			int size=radioBn.size();
			String gender="Male";
			
			
			
			
			for(WebElement web:radioBn) {
				if(web.isEnabled()) {
					String value=web.getText();
					System.out.println(value);
					
					if(value.equals(gender)) {
						web.click();
						
					}
				}
			}
		
			
			
		//driver.quit();

	}

}
