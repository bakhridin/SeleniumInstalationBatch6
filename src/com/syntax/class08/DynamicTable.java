package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DynamicTable extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
         
		
		
		String expectValue="Bob Feather";
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
		for(int i=1;i<rows.size();i++) {
			String rowsText=rows.get(i-1).getText();
			
			if(rowsText.contains(expectValue)) {
				
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
				break;
			}
		}
		
		
		Thread.sleep(2000);
		tearDown();
	}

}
