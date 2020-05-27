package com.Selenium.test;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class DropDownNonSelectTag extends CommonMethods {
	
	public static void main(String[] args) {
		setUp();
		
		
		List<WebElement>allList=driver.findElements(By.xpath("//li[@class='list-group-item']"));
		
		System.out.println("The size of list is "+allList.size());
		
		for (WebElement list : allList) {
			String listText=list.getText();
			System.out.println(listText);
			if(listText.equals("Morbi leo risus")) {
				list.click();
				break;
			}
			
		}
		
		List<WebElement> Xlist=driver.findElements(By.xpath("//div[contains(@class,'list-left ')]/div/div/following-sibling::ul/li"));
		
		System.out.println(" Size of Xlist is "+Xlist.size());
		
		Iterator<WebElement>it=Xlist.iterator();
		
		while(it.hasNext()) {
			WebElement element = it.next();
			String textIt=element.getText();
			System.out.println("The list of Xlist is "+textIt);
			
			if(textIt.equals("Vestibulum at eros")) {
				System.out.println("Passed");
				element.click();
				break;
				
			}
				
			
		}
	List<WebElement> Xxlist=driver.findElements(By.xpath("//div[contains(@class,'list-right ')]/div/div/following-sibling::ul/li"));
		
		System.out.println(" Size of Xlist is "+Xxlist.size());
		
		Iterator<WebElement>iti=Xxlist.iterator();
		
		while(iti.hasNext()) {
			WebElement elementi = iti.next();
			String textIti=elementi.getText();
			System.out.println("The list of Xlist is "+textIti);
			
			if(textIti.equals("Porta ac consectetur ac")) {
				System.out.println("Passed");
				elementi.click();
				break;
				
			}
				
			
		}
		
		
	}

}
