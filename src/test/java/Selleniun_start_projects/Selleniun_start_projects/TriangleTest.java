package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import okio.Timeout;


public class TriangleTest {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\\\\\\\geckodriver-v0.34.0-win64\\\\\\\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	  }
		
	@Test
	public void Test_C1T_C2T_C3T_C4T() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Equilateral";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }
	@Test
	public void Test_C1T_C2T_C3F_C4F() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("5");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("5");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("9");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Isosceles";
			assertEquals(answer.getText(), Result);
			browser.close();
			
   }
	@Test
	public void Test_C1T_C2F_C3T_C4F() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("8");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("15");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("8");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Isosceles";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }
	@Test
	public void Test_C1T_C2F_C3F_C4T() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("6");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("4");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("4");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Isosceles";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }
	@Test
	public void Test_C1T_C2F_C3F_C4F() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("8");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("6");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("5");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Scalene";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }
	@Test
	public void Test_C1F_C2T_C3F_C4F() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("6");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Error: Not a Triangle";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }
	@Test
	public void Test_C1F_C2F_C3T_C4F() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("1");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("4");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("1");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Error: Not a Triangle";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }
	@Test
	public void Test_C1F_C2F_C3F_C4T() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("7");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Error: Not a Triangle";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }
	@Test
	public void Test_C1F_C2F_C3F_C4F() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("12");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("8");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
			browser.findElement(By.id("identify-triangle-action")).click();
			WebElement answer = browser.findElement(By.className("answer"));
			String Result = "Error: Not a Triangle";
			assertEquals(answer.getText(), Result);
			browser.close();
			

   }

}


