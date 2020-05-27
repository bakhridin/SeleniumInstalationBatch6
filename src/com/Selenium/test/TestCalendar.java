package com.Selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class TestCalendar extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	  
		setUp();

		driver.findElement(By.id("aa-leavingOn")).click();
		Thread.sleep(2000);
		
		String depMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		
	    while(!depMonth.equals("July")) {
	    	
	    	driver.findElement(By.xpath("//a[@title='Next']")).click();
	    	
	    	Thread.sleep(2000);
	    	
	    	depMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    	
	    	
	    	
	    	   }
		
		List<WebElement>depCells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		
		for(WebElement depCell:depCells) {
			
			String depText=depCell.getText();
			if(depText.equals("16")) {
				depCell.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click();
		String retMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		while(!retMonth.equals("January")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			retMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			
		}
		
		
		List<WebElement>retCells=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		
		for(WebElement retCell:retCells) {
			String retText=retCell.getText();
			if(retText.equals("10")) {
				retCell.click();
				break;
			}
			
		}
		
		
		
		
		
		
	}

}
