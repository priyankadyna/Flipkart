package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends keywords{
	public static void main(String[] args) {
		   try{
				launch("https://chercher.tech/practice/frames-example-selenium-webdriver");
			    maximize();
			    Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30))
			    		.pollingEvery(Duration.ofSeconds(3))
			    		.ignoring(Exception.class);
			    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame1"));
			    String text = driver.findElement(By.xpath("//b[text()='Topic :']")).getText();
			    System.out.println(text);
		   }
		   catch(Exception e){
				System.out.println(e.toString());
			}
	}
}
