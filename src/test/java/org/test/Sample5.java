package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sample5 extends keywords {
	public static void main(String[] args){
		try{
			String url = "https://www.facebook.com/";
			launch(url);
		    maximize();
			WebElement login = driver.findElement(By.id("email"));
			//login.sendKeys("Selenium");
			Thread.sleep(2000);
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.SHIFT).sendKeys("Selenium").keyUp(Keys.SHIFT).build().perform();
			
		}
			catch(Exception e){
				System.out.println(e.toString());
			}
	}
}
