package com.Selenium.test;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AdvancedXPathToLogin extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * TC 3: HRMS Login Navigate to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login to the
		 * application by writing xpath based on “parent and child relation”
		 */
		
		setUp();
		
		driver.findElement(By.xpath("//form[@id='frmLogin']/div[2]/input")).sendKeys(ConfigsReader.getProperty("username"));
		
		driver.findElement(By.xpath("//div[@id='divPassword']/input[@id='txtPassword']")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input[@id='btnLogin']")).click();

	}

}
