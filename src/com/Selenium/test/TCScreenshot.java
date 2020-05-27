package com.Selenium.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.CommonMethods;

public class TCScreenshot extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 2: Upload file and Take Screenshot Navigate to
		 * “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
		 * Upload file Verify file got successfully uploaded and take screenshot
		 * 
		 */
	
		setUp();
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys("/Users/macbook/Desktop/testText.txt");
		driver.findElement(By.xpath("//button[text()='Upload File']")).click();
		
		Alert alert=driver.switchTo().alert();
		String simpleAlert=alert.getText();
		
		System.out.println(simpleAlert);
		
		sleep(2);
		
		alert.accept();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source,new File("screenshots/HRMS/tspics.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		driver.quit();
		
		
	}

}
