package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

 public class Check_Password  {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\\\\\\\geckodriver-v0.34.0-win64\\\\\\\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
	 @Test
	 public void Test_ShortPassword() {
		   	
			
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Abc");
			browser.findElement(By.name("validate")).click();  
			WebElement answer = browser.findElement(By.name("validation_message"));
			String value = answer.getAttribute("value");
			String Expected = "Invalid Value";
			assertEquals(value, Expected);
			browser.close();
			
 }
	 @Test
	 public void Test_InvalidCharacter() {
		   	
			
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Abcdef!");
			browser.findElement(By.name("validate")).click();  
			WebElement answer = browser.findElement(By.name("validation_message"));
			String value = answer.getAttribute("value");
			String Expected = "Invalid Value";
			assertEquals(value, Expected);
			browser.close();
			
 }
	 @Test
	 public void Test_ValidPassword() {
		   	
			
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Leibo24");
			browser.findElement(By.name("validate")).click();  
			WebElement answer = browser.findElement(By.name("validation_message"));
			String value = answer.getAttribute("value");
			String Expected = "Valid Value";
			assertEquals(value, Expected);
			browser.close();
			
 }
	 @Test
	 public void Test_LongPassword() {
		   	
			
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Leibo2458");
			browser.findElement(By.name("validate")).click();  
			WebElement answer = browser.findElement(By.name("validation_message"));
			String value = answer.getAttribute("value");
			String Expected = "Invalid Value";
			assertEquals(value, Expected);
			browser.close();
			
 }
 }