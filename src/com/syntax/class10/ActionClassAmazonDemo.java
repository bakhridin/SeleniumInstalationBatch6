package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionClassAmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BaseClass.setUp();
		
		Actions action= new Actions(driver);
		
		WebElement element1=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		action.moveToElement(element1).perform();
		
		WebElement element2=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		
		if(element2.getText().contains("Start")) {
			System.out.println("Menue displayed");
			
		}else {
			System.out.println("Menue not display");
		}
		
		action.contextClick(element2).perform();
		
		WebElement element3=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		action.moveToElement(element3).click().sendKeys("Movies").doubleClick().perform();
		
		Thread.sleep(5000);
		
		BaseClass.tearDown();
				

	}

}
