package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class PageFactoryDragAndDrop {
	
	@FindBy(xpath = "//div[@id='draggable']")
	public WebElement drag;
	
	@FindBy(xpath = "//div[@id='droppable']")
      public WebElement drop;
	
	PageFactoryDragAndDrop(){
		PageFactory.initElements(BaseClass.driver, this);
	}
}
