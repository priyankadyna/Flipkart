package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywords {
	static WebDriver driver;
	public static void launch(String url) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to(url);//launch url 
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
}
