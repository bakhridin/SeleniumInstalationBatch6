package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	public static String url="https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		 WebDriver driver=new ChromeDriver();
		 
		
	  driver.get(url);
	  WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='sex-0']"));
	         System.out.println(maleRadioB.isDisplayed());//true
	         System.out.println(maleRadioB.isEnabled());//true
	         System.out.println(maleRadioB.isSelected());//false
	         
	         //first way to click on a Radio Button
	         maleRadioB.click();
	         
	         System.out.println(maleRadioB.isSelected());
	         
	         
	         //second way to click on Radio Button
	         List<WebElement>proList=driver.findElements(By.xpath("//input[@name='profession']"));
	         int listSize=proList.size();
	         System.out.println(listSize);
	         
	         String valueToBeselected="Automation Tester";
	         
	         for (WebElement profession:proList) {
	        	 if(profession.isEnabled()) {
	        		 String value=profession.getAttribute("value");
	        		 System.out.println(value);
	        		 
	        		 if(value.equals(valueToBeselected)) {
	        			 profession.click();
	        			 break;
	        			 
	        		 }
	        	 }
	        	 
	         }
	         
	         
	}

}
