package org.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Screenshot extends keywords{
	public static void main(String[] args) {
		   try{
				String url = "https://www.flipkart.com/";
				launch(url);
			    maximize();
			    
			    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			    driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
			    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
			    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
			    
			    String parent = driver.getWindowHandle();
			    Set<String> child = driver.getWindowHandles();
			    List<String> child1 = new ArrayList<>(child);
			    driver.switchTo().window(child1.get(2));
			    WebElement te = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		    	String text = te.getText();
		    	System.out.println(text);
		    	
		    	//Screenshot
		    	TakesScreenshot tk = (TakesScreenshot)driver;
		    	File src = tk.getScreenshotAs(OutputType.FILE);
		    	File desc = new File("C:\\Users\\dynam\\eclipse-workspace\\FebMvn\\src\\test\\resources\\Redmi.png");
		    	FileUtils.copyFile(src, desc);
		   }
		   catch(Exception e){
				System.out.println(e.toString());
		   }
	}
}
