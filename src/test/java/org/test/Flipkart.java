package org.test;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
    public class Flipkart extends Flipkart1{
		
		public static void main(String[] args) {
			try {
				
				File f = new File("D:\\RedmiMobiles.xlsx");
				Workbook w = new XSSFWorkbook();
				Sheet s = w.createSheet("Names and Prices");
				int rowno=0;
				
				launch("https://www.flipkart.com/");
				maximize();
				
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
				
				Thread.sleep(3000);
				List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				for (int i = 0; i<name.size(); i++) {
					
					WebElement header = name.get(i);
					String names = header.getText();
					List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
					for (int j = i; j==i; j++) {
						
						WebElement headers = price.get(j);
						String prices = headers.getText();
						Map<String,String> m = new LinkedHashMap<>();
						m.put(names, prices);
						Set<Entry<String, String>> entrySet = m.entrySet();
						for (Entry<String, String> entry : entrySet) {
							System.out.println(entry);
							Row row=s.createRow(rowno++);
							 row.createCell(0).setCellValue((String)entry.getKey());
				             row.createCell(1).setCellValue((String)entry.getValue());
							
						}
						
					}
					
				}
				
				FileOutputStream f1 = new FileOutputStream(f);
				w.write(f1);
				f1.close();
			}
			catch (Exception e) {
				
			System.out.println(e.toString());
			
			}
	}
}
