package com.Selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class TableDemoHRMS extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		
		sendText(userName, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement loginB=driver.findElement(By.id("btnLogin"));
		click(loginB);
		
		WebElement admin=driver.findElement(By.xpath("//b[text()='Admin']"));
		
		click(admin);
		
		Actions action =new Actions(driver);
		
		WebElement usMan=driver.findElement(By.cssSelector("a#menu_admin_UserManagement"));
		
		action.moveToElement(usMan).perform();
		
		WebElement user=driver.findElement(By.cssSelector("a#menu_admin_viewSystemUsers"));
		
		click(user);
		
		
		
		List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(" Size of table rows are "+tableRows.size());
		String bruno="bruno45";
		for (int i=1;i<tableRows.size();i++) {
			
			String rows=tableRows.get(i-1).getText();
			
			
			if(rows.contains(bruno)) {
				sleep(2);
				
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" +i+ "]/td[1]")).click();
				
				break;
				
			}
			
		}
		
//		for (int i=0;i<tableRows.size();i++) {
//		
//		String rows=tableRows.get(i).getText();
//		
//		
//		if(rows.contains(bruno)) {
//			sleep(2);
//			
//			driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]")).get(i).click();
//			break;
//			
//		}
//		
//	}
	}

}
