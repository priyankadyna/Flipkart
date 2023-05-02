package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart1 {
		
		static WebDriver driver;
		public static void launch(String url) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(); 
			driver.navigate().to(url);
		}
		
		public static void maximize() {
			driver.manage().window().maximize();
			
		}

		public static void minimize() {
			driver.manage().window().minimize();
		}
	}

