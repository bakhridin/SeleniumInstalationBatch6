package com.syntax.pages;

import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class PageFactoryDragTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		PageFactoryDragAndDrop obj=new PageFactoryDragAndDrop();
		
           Actions action=new Actions(driver);
           
           sleep(2);
           
           action.dragAndDrop(obj.drag, obj.drop).perform();
	}

}
