package org.test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dynam\\eclipse-workspace\\FebMvn\\target\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "https://facebook.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		if(url.equals(currentUrl)) {
			System.out.println("Both URL are Verified");
		}
		else {
			System.out.println("Both URl are not Same: "+currentUrl);
		}
		String title = driver.getTitle();
		System.out.println(title);
	}
}