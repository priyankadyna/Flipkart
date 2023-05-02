package org.test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample4 extends keywords{
	public static void main(String[] args){
		try{
			String url = "https://www.flipkart.com/";
			launch(url);
		    maximize();
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
			Thread.sleep(2000);
			List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			for(int i=0; i<name.size();i++) {
				WebElement header = name.get(i);
				String names = header.getText();
				List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
				for(int j=i; j==i;j++) {
					WebElement headers = prices.get(j);
					String price =headers.getText();
					Map<String, String> mp = new LinkedHashMap<>();
					mp.put(names, price);
					Set<Entry<String, String>> entrySet = mp.entrySet();
					for(Entry<String, String> entry : entrySet) {
						System.out.println(entry);
					}
					
				}
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}

	
