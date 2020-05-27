package com.Selenium.test_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Calendartable extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		WebElement calendarClick=driver.findElement(By.xpath("//span[text()='Depart']"));
		
		click(calendarClick);
		String actualMonth="September";
		
		while(true) {
			String departMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
			WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
			
			if(!departMonth.equals(actualMonth)) {
				nextButton.click();
				
			}else {
				break;
			}
			
			
			
		}
		List<WebElement>tableDates=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
		
		for (WebElement oneDay : tableDates) {
			String dayText=oneDay.getText();
			if(dayText.equals("21")) {
				oneDay.click();
				break;
			}
			
			
		}
		
		driver.findElement(By.xpath("//button[text()='done']")).click();
		
		
		System.out.println("--------------------------------------");
		sleep(2);
		
		
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		sleep(2);
		
		String returnMonth="December";
		
		while(true) {
		
		String actualmomth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));

		  if(!actualmomth.equals(returnMonth)) {
			  
			  nextButton.click();
			  sleep(2);
			  
		  }else {
			  break;
			  
		  }
		
		}
		List<WebElement>returnm=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']//tr/td"));
		for (WebElement retday : returnm) {
			String day=retday.getText();
			if(day.equals("15")) {
				sleep(2);
				retday.click();
				break;
				
			}
			
		}
		
		driver.findElement(By.xpath("//button[text()='done']")).click();
		
		
	}

}
