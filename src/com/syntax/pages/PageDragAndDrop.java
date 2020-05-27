package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class PageDragAndDrop extends CommonMethods{
	
	public WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	public WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		PageDragAndDrop obj=new PageDragAndDrop();
		
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		action.dragAndDrop(obj.drag, obj.drop).perform();
		
	}

}
