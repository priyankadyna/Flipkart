package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends keywords{
	public static void main(String[] args){
	try{
		String url = "https://www.flipkart.com/";
		launch(url);
	    maximize();
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(5000);
	    WebElement user = driver.findElement(By.xpath("//div[text()='Grocery']"));
	    WebElement pass = driver.findElement(By.xpath("//div[text()='Caps']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", pass);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", user);
		
	}
	catch(Exception e){
		System.out.println(e.toString());
	}
  }
}
