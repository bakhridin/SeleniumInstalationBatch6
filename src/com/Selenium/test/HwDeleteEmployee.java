package com.Selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HwDeleteEmployee extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * TC 2: Delete Employee Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login into
		 * the application Add Employee Verify Employee has been added Go to Employee
		 * List Delete added Employee Quit the browser
		 * 
		 * 
		 */
		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();

		WebElement pimLink = driver.findElement(By.id("menu_pim_viewPimModule"));

		pimLink.click();

		Thread.sleep(2000);

		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(2000);

		String firstName = "Sarvar";
		String lastName = "Halabi";

		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);

		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empID);

		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();

		Thread.sleep(2000);
		String verfyText = driver.findElement(By.xpath("//div[@id='profile-pic']")).getText();
		System.out.println(verfyText);

		Thread.sleep(2000);

		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());

		Thread.sleep(2000);

		List<WebElement> colls = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
		System.out.println(colls.size());

		boolean found = false;
		while (!found) {

			for (int i = 1; i <= rows.size(); i++) {
				for (int j = 1; j <= colls.size(); j++) {

					WebElement celldata = driver
							.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[2]"));
					

					String cellDataText = celldata.getText();
					if (cellDataText.equals(empID)) {
						found = true;
						driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
						
						Thread.sleep(3000);
						
						driver.findElement(By.id("btnDelete")).click();
						
						Thread.sleep(3000);
						
						driver.findElement(By.id("dialogDeleteBtn")).click();
						
						break;
					}

				}
			}
			driver.findElement(By.xpath("//a[text()='Next']")).click();
			
	}

		Thread.sleep(5000);
		 tearDown();
	}

}
