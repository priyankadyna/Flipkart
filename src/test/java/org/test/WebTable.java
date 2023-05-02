package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class WebTable extends keywords {
	public static void main(String[] args) {
		   try{
				String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
				launch(url);
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
			    			if(text.equals("Dubai")) {
			    				System.out.println("Particular data is present: "+text);
			    			}
			    		}
			    	}
			    }
		   }
		   catch(Exception e){
				System.out.println(e.toString());
			}
		 }
}