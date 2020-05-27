package com.syntax.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class AmericanAirlineCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.aa.com/homePage.do");
		
		//driver.manage().window().fullscreen();
		
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("IAD",Keys.TAB);
		
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("JFK");
		
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();
		
		
		boolean flag=false;
		
		while(!flag) {
			
			String dMonth=driver.findElement(By.xpath("//div[contains(@class,' ui-corner-left')]/div")).getText();
			   if(dMonth.equals("July 2020")) {
				   
	 List<WebElement>depCells=driver.findElements(By.xpath("//div[contains(@class,' ui-corner-left')]/following::table/tbody/tr/td"));
	 
	          for(WebElement depCell:depCells) {
	        	  String cell=depCell.getText();
	        	  if(cell.equals("15")) {
	        		  depCell.click();
	        		  flag=true;
	        		  break;
	        	  }
	        	  
	          }
	          
				   
			   }else {
				   
				   driver.findElement(By.xpath("//a[@title='Next']")).click();
			   }
			
			   Thread.sleep(3000);
			
			
			}
		    
		driver.findElement(By.id("aa-returningFrom")).click();
		flag=false;
		
		while(!flag) {
		
		String rMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-right')]")).getText();
		
		if(rMonth.equals("January 2021")) {
			
			 List<WebElement>retCells=driver.findElements(By.xpath("//div[contains(@class,' ui-corner-left')]/following::table/tbody/tr/td"));

			for(WebElement retCell:retCells) {
				
				String rCell=retCell.getText();
				if(rCell.equals("21")) {
					retCell.click();
					flag=true;
					break;
				}
				
			}
		}else {
			   driver.findElement(By.xpath("//a[@title='Next']")).click();

			
		}
		   Thread.sleep(3000);


		}
	}

}
