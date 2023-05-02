package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts{
	static WebDriver driver;
	public static void main(String[] args){
		try{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("alertButton")).click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(2000);
			a.accept();
			
			driver.findElement(By.id("confirmButton")).click();
			a.dismiss();
			
			driver.findElement(By.id("promtButton")).click();
			String text = a.getText();
			System.out.println(text);
			
			a.sendKeys("Selenium");
			a.accept();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
