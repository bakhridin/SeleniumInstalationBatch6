package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDmo extends BaseClass {

	public static void main(String[] args) throws InterruptedException  {
		
		setUp();
		
		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(2000);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/pics.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
		
		
		
		tearDown();
		
		
		


	}

}
