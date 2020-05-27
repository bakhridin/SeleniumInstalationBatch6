package com.Selenium.test;

//http://jiravm.centralus.cloudapp.azure.com:8081/basic-select-dropdown-demo.html

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class MultiselectDropDown extends CommonMethods{

	public static void main(String[] args) {
		
      setUp();
      WebElement multiselect=driver.findElement(By.xpath("//select[@id='multi-select']"));
      
      Select selectMulti=new Select(multiselect);
      
      
      selectMulti.selectByValue("California");
      sleep(1);
      selectMulti.selectByVisibleText("Ohio");
      sleep(1);
      selectMulti.selectByIndex(3);
      
      sleep(3);
      
      selectMulti.deselectAll();
      

      sleep(3);
      
      tearDown();
	}

}
