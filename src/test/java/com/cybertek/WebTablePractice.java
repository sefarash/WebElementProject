package com.cybertek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractice {
	WebDriver driver;
	
	@Test
	public void setUp() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://money.rediff.com/gainers/bsc/daily/groupa");
	//To locate table.
	WebElement myTable = driver.findElement(By.xpath("/html/body/div/div/table/tbody"));
	//To locate rows of table. 
	List<WebElement> table_row = myTable.findElements(By.tagName("tr"));
	int rowSize = table_row.size();
	//System.out.println(rows_table.size());
	
	//Loop will execute till the last row of table.
	for (int i = 0; i < rowSize; i++) {
		List<WebElement> table_col = table_row.get(i).findElements(By.tagName("td"));
		int colSize = table_col.size();
		System.out.println("Number of row is "+i);
		for (int j = 0; j < colSize; j++) {
			String text =table_col.get(j).getText();
			System.out.println("Cell value of row "+ i+" and column "+ j+ " is "+ text);
		}
	}
	
	    //To locate columns(cells) of that specific row.
	    
	    //To calculate no of columns (cells). In that specific row.
	   
	   // System.out.println(Columns_row.size());
	    
	    //Loop will execute till the last cell of that specific row.
	    
	        // To retrieve text from that specific cell.
	        
	    
	
	}
}