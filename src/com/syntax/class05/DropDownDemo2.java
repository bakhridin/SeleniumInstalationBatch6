package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass  {

	public static void main(String[] args) throws InterruptedException {
	     
		setUp();
		
		WebElement continents=driver.findElement(By.id("continents"));
		
		Select select=new Select(continents);
		
		List<WebElement>options=select.getOptions();
		
		for(WebElement option:options) {
			String text=option.getText();
			System.out.println(text);
			
			if(text.equals("Africa")) {
				option.click();
				
				String ddtext=option.getText();
				
				if(ddtext.equals("Africa")) {
					System.out.println("Africa is selected:: "+option.isSelected());
					
				}else {
					System.out.println("Africa is not selected");
				}
			}
			
		}
		
		boolean isMultiple=select.isMultiple();
		
		System.out.println("The Continent DD is Multiple:: "+isMultiple);
		Thread.sleep(2000);
		
		tearDown();

	}

}
