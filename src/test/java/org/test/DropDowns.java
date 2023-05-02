package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
public class DropDowns extends keywords{
   public static void main(String[] args) {
	   try{
			String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
			launch(url);
		    maximize();
		   WebElement single = driver.findElement(By.xpath("//select[@id='second']"));
		   Select s = new Select(single);
		   
		   boolean multiple = s.isMultiple();
		   System.out.println(multiple);
		   
		   s.selectByIndex(0);
		   s.selectByIndex(1);
		   s.selectByIndex(2);
		   
		   WebElement firstSelectedOption = s.getFirstSelectedOption();
			      String Text = firstSelectedOption.getText();
			      System.out.println(Text);
	   }
	   catch(Exception e){
			System.out.println(e.toString());
		}
	 }
}

