package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	static WebDriver driver;
	public static void main(String[] args){
		try{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
			driver.manage().window().maximize();
			
			driver.switchTo().frame("frame1");
			driver.switchTo().frame("frame3");
			driver.findElement(By.xpath("//input[@id='a']")).click();
			driver.switchTo().parentFrame();
			WebElement te = driver.findElement(By.xpath("//b[text()='Topic :']"));
			String text = te.getText();
			System.out.println(text);
			driver.switchTo().defaultContent();
			String text2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
			System.out.println(text2);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
