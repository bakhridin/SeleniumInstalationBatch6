package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass  {

	public static void main(String[] args) throws InterruptedException {
	     
		setUp();
		
		WebElement weekdd=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(weekdd);
		
		select.selectByIndex(2);
		
		List<WebElement>options=select.getOptions();
		
		System.out.println("Number of options in the DropDown "+options.size());
		
		for(int i=1;i<options.size();i++) {
			select.selectByIndex(i);
			
			Thread.sleep(2000);
		}
		
            select.selectByVisibleText("Friday");
            
            Thread.sleep(2000);
            
            tearDown();
	}

}
