    package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	ChromeDriver driver;
	
	public void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HpDell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
	public void getUrl() {
		driver.get("http://www.amazon.com");
	}
	public void searchTextBox (WebElement x, String y) {
		
		x.sendKeys(y);
	}
	public void isElementpresent() {
		
		boolean r=driver.findElementById("").isDisplayed();
		System.out.println(r);
		
	}
	
	public void isElementpresent2(By x) {
		boolean g=driver.findElementById("").isDisplayed();
		System.out.println(g);
		
	}
	
	     
}
