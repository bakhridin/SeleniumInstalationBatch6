package com.Selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class DropDownPractice extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		
	    WebElement selectDropDown=driver.findElement(By.cssSelector("select#select-demo"));
	    
	      Select select=new Select(selectDropDown);
	      
	      //select.selectByVisibleText("Sunday");
	      
	      select.selectByValue("Wednesday");
	      
	      select.selectByIndex(2);
	      
	      
	      
	      List<WebElement>option=select.getOptions();
	      
	      String valueOfDD="Friday";
	      
	      for (WebElement oneOption : option) {
	    	  String oneOptiontxt=oneOption.getText();
    		  System.out.println(oneOptiontxt);
    		  
	    	  if(oneOption.isEnabled()&& !oneOption.isSelected()) {
	    		  
	    		if(oneOptiontxt.equals(valueOfDD)) {
	    			oneOption.click();
	    			break;
	    		}
	    		  
	    	  }
	    	 
	    	  
			
		}
	      
	      sleep(2);
	      
	      tearDown();
	}

}
