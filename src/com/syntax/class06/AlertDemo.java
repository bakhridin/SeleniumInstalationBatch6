package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		//Handling simple alert/PopUps
		
		Alert simpleAlert=driver.switchTo().alert();
		Thread.sleep(1000);
		
		String simpleAText=simpleAlert.getText();
		System.out.println("This is simple Alert text:: "+simpleAText);
		Thread.sleep(1000);
		
		simpleAlert.accept();
		Thread.sleep(1000);
		
		//Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(1000);
		String confirmText=confirmAlert.getText();
		System.out.println("This is Confim Alert text:: "+confirmText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		Thread.sleep(1000);
		
		
		//Handling Prompt alert/confirmation alerts by providing confirmation massage.
		String name="Alex";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("This is Prompt alert text:: "+promptAlert.getText());
		promptAlert.sendKeys(name);
		promptAlert.accept();
		Thread.sleep(1000);
		
		String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		
		if(text.contains(name)) {
			System.out.println("Text "+name+" was saccessfully added");
			
		}else {
			System.out.println("Text "+name+" was not added");
		}
		
		
		
		
		
		
		
		tearDown();
		

	}

}
