package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;
public class Selenium_calculator {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 	  System.setProperty("webdriver.gecko.driver","C:\\\\\\\\geckodriver-v0.34.0-win64\\\\\\\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/calculator.html";
		      browser.get(url);
		
	  }
	 
	 @Test
		public void Plus_Test() {
	    	
			
				browser.findElement(By.id("button08")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button09")).click();
				browser.findElement(By.id("buttonequals")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "17";
				assertEquals(Expected,result);
				browser.close();	
}
	 @Test
		public void Minus_Test() {
	    	
			
				browser.findElement(By.id("button06")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button01")).click();
				browser.findElement(By.id("buttonequals")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "5";
				assertEquals(Expected,result);
				browser.close();			
}	 
	 @Test
		public void Multiply_Test() {
	    	
			
				browser.findElement(By.id("button07")).click();
				browser.findElement(By.id("buttonmultiply")).click();
				browser.findElement(By.id("button02")).click();
				browser.findElement(By.id("buttonequals")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "14";
				assertEquals(Expected,result);
				browser.close();			
}	
	 @Test
		public void Divide_Test() {
	    	
			
				browser.findElement(By.id("button08")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button02")).click();
				browser.findElement(By.id("buttonequals")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "4";
				assertEquals(Expected,result);
				browser.close();			
}	
	 @Test
		public void DivideByZero_Test() {
	    	
			
				browser.findElement(By.id("button09")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttonequals")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "Infinity";
				assertEquals(Expected,result);
				browser.close();			
}	
	 @Test
		public void DecimalNumber_Test() {
	    	
			
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttondot")).click();
				browser.findElement(By.id("button02")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttondot")).click();
				browser.findElement(By.id("button04")).click();
				browser.findElement(By.id("buttonequals")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "0.5";
				assertEquals(Expected,result);
				browser.close();			
}	
	 @Test
		public void  NegativeResult_Test() {
	    	
			
				browser.findElement(By.id("button02")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button06")).click();
				browser.findElement(By.id("buttonequals")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "-4";
				assertEquals(Expected,result);
				browser.close();			
}	
}