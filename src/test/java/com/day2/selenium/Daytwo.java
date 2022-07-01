package com.day2.selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Daytwo {
	@Test
	public void testcase2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.com/demo");
		driver.manage().window().maximize();
		driver.findElement(By.name("first_name")).sendKeys("Aina");
		driver.findElement(By.name("last_name")).sendKeys("Desh");
		driver.findElement(By.name("business_name")).sendKeys("Ain");
		driver.findElement(By.name("email")).sendKeys("ain@gmail.com");
		driver.findElement(By.id("demo")).click();
		Thread.sleep(20000);
		String actual=driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[3]/h1/strong")).getText();
		System.out.println("act="+actual);
		boolean result=actual.trim().equalsIgnoreCase("Thank you!");
		assertTrue(result);
		//Thread.sleep(2000);
		driver.close();
		
		
	}
	

}
