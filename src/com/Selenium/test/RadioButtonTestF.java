package com.Selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class RadioButtonTestF extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		List<WebElement> radiBns = driver.findElements(By.xpath("//input[@name='optradio']"));
		String nameVal = "Male";
		for (WebElement webElement : radiBns) {

			if (webElement.isEnabled() && !webElement.isSelected()) {
				String valueRadioBn = webElement.getAttribute("value");
				System.out.println(valueRadioBn);

				if (valueRadioBn.equals(nameVal)) {

					webElement.click();
					break;
				}
			}

		}
		String age = "5 - 15";
		List<WebElement> radioAge = driver.findElements(By.xpath("//input[@name='ageGroup']"));
		
		clickRadioOrCheckbox(radioAge, age);
		
//		for (WebElement webAge : radioAge) {
//			if (webAge.isEnabled() && !webAge.isSelected()) {
//				String ageBt = webAge.getAttribute("value");
//
//				if (ageBt.equals(age)) {
//					webAge.click();
//					break;
//
//				}
//
//			}
//		}
//		
		List<WebElement>gender=driver.findElements(By.xpath("//input[@name='gender']"));
		String gen="Male";
		for (WebElement genElement : gender) {
			
			if(genElement.isEnabled()&& !genElement.isSelected()) {
				String genderN=genElement.getAttribute("value");
				
				if(genderN.equals(gen)) {
					genElement.click();
				}
				
			}
			
		}

	}

}
