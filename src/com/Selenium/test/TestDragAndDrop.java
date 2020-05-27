package com.Selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class TestDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: 
		 * Drag and Drop verification 
		 * Open chrome browser Go to
		 * “http://www.uitestpractice.com/” 
		 * Click on “Droppable” link Using mouse drag
		 * “Drag me to my target” to the “Drop Here” Close the browser
		 * 
		 */
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/");
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action=new Actions(driver);
		
		//Thread.sleep(1000);
		
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		

	}

}
