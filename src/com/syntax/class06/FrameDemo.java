package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		
		//By index
		driver.switchTo().frame(0);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Vital");
		//switch back to main window/page/default content
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//By mameOrID
		driver.switchTo().frame("iframe_a");
		name.clear();
		name.sendKeys("Sarmed");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//By Webelement object
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src=''/Demo.html]"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		tearDown();
	    
		
		

	}

}
