package com.syntax.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
       setUp();
       WebElement el1=driver.findElement(By.id("u_0_m"));
       sendText(el1,"Ahmad");
       
       WebElement el2=driver.findElement(By.id("u_0_o"));
       sendText(el2,"Umarov");
       
       WebElement el3=driver.findElement(By.id("u_0_r"));
       sendText(el3,"232-323-2323");
       
       WebElement el4=driver.findElement(By.id("u_0_w"));
       sendText(el4,"Ahmad1234");
       
       
       List<WebElement>el5=driver.findElements(By.xpath("//input[@type='radio']"));
       clickRadioOrCheckbox(el5,"1");
       
       WebElement el6=driver.findElement(By.xpath("//select[@id='month']"));
       selectDdValue(el6,"Jan");
       
       WebElement el7=driver.findElement(By.xpath("//select[@id='day']"));
       selectDdValue(el7,"30");
       
       WebElement el8=driver.findElement(By.xpath("//select[@id='year']"));
       selectDdValue(el8,20);
       
       
       Thread.sleep(2000);
       
       tearDown();
       
       
	}

}
