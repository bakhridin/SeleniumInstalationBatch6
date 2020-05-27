package com.Selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class TableDemoHRMS2 extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		
		sendText(userName, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement loginB=driver.findElement(By.id("btnLogin"));
		click(loginB);
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
		sleep(3);
		employeeList.click();

		
		List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(" Size of table rows are "+tableRows.size());
		String id="7604";
		for (int i=1;i<tableRows.size();i++) {
			
			String rows=tableRows.get(i-1).getText();
			
			
			if(rows.contains(id)) {
				sleep(2);
				
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" +i+ "]/td[1]")).click();
				
				sleep(2);
				
				driver.findElement(By.id("btnDelete")).click();
				sleep(2);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
				
			}
			
		}
		
		sleep(2);
		driver.quit();
	}

}
