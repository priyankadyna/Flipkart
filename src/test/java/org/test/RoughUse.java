package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RoughUse{
	static int rowval;
	static int columnval;
	public static void main(String[] args){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\dynam\\eclipse-workspace\\FebMvn\\target\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			String url = "https://demo.guru99.com/test/web-table-element.php";
			driver.get(url);
			driver.manage().window().maximize();
			//find row size
			int rowSize = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
			System.out.println("Row Size "+rowSize);
			//find column size
			int columnSize = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td")).size();
			System.out.println("Column Size "+columnSize);
			//common xpath for table header
			List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
			WebElement comp = driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Company']"));
			WebElement currprice = driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Current Price (Rs)']"));
			int compIndexPos = tableHeaders.indexOf(comp)+1;
			System.out.println("CompIndexPos: "+compIndexPos);
			int currPriceIndexPos = tableHeaders.indexOf(currprice)+1;
			System.out.println("CurrPriceIndexPos" +currPriceIndexPos);
			//print list of company names and values
			for(int k=1; k<=rowSize; k++) {
				WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+ k +"]//td["+compIndexPos+"]"));
				String text = element.getText();
				WebElement element1 = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+ k +"]//td["+currPriceIndexPos+"]"));
				String text1 = element1.getText();
				System.out.println(text+" has current price value of "+text1);
			}	
	}
}