package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Redmimobiles extends keywords{
	public static void main(String[] args){
		try{
			String url = "https://www.flipkart.com/";
			launch(url);
		    maximize();
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
			Thread.sleep(2000);
			List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			File f = new File("C:\\Users\\dynam\\eclipse-workspace\\FebMvn\\src\\test\\resources\\Task.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet s = w.createSheet("Flipkart");
			for(int i=0; i<name.size();i++) {
				WebElement header = name.get(i);
				String names = header.getText();
				Row r = s.createRow(i);
				Cell c = r.createCell(0);
				c.setCellValue(names);
				List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
				for(int j=i; j==i;j++) {
					WebElement headers = prices.get(j);
					String price =headers.getText();
					Cell c1 = r.createCell(1);
					c1.setCellValue(price);
				}
			}
			FileOutputStream f2 = new FileOutputStream(f);
			w.write(f2);
			f2.close();	
                  System.out.println("Newly updated");	
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
