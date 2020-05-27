package com.Selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AdvancedXPathToLoginJS extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * TC 3: HRMS Login Navigate to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login to the
		 * application by writing xpath based on “parent and child relation”
		 */
		
		setUp();
		
		driver.findElement(By.xpath("//div[@id='logInPanelHeading']/following-sibling::div[1]/input")).sendKeys(ConfigsReader.getProperty("username"));
		
		driver.findElement(By.xpath("//div[@id='logInPanelHeading']/following-sibling::div[2]/input")).sendKeys(ConfigsReader.getProperty("password"));
		
		WebElement element=driver.findElement(By.xpath("//div[@id='divLoginButton']/input[@id='btnLogin']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
           
		
		js.executeScript("arguments[0].click();",element );
	}

}
