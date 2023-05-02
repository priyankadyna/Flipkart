package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Debug extends keywords{
	public static void main(String[] args) {
		   try{
				launch("https://www.techlistic.com/p/demo-selenium-practice.html");
			    maximize();
			    
			    List<WebElement> iTable = driver.findElements(By.tagName("table"));
			    for(int i=0; i<iTable.size(); i++) {
			    	WebElement table = iTable.get(i);
			    	WebElement tBody = table.findElement(By.tagName("tBody"));
			    	List<WebElement> iRow = tBody.findElements(By.tagName("tr"));
			    	for(int j=0; j<iRow.size(); j++) {
			    		WebElement row = iRow.get(j);
			    		List<WebElement> iData = row.findElements(By.tagName("td"));
			    		for(int k=0; k<iData.size(); k++) {
			    			WebElement data = iData.get(k);
			    			String text = data.getText();
			    			System.out.println(text);
			    		}
			    	}
			    }
		   }
		   catch(Exception e){
				System.out.println(e.toString());
			}
	}
}
