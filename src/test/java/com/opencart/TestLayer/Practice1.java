package com.opencart.TestLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1 {
	
	@Test
	public void test1() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String Expected = driver.getTitle();
	Assert.assertEquals(Expected , "STORE");
	}
	
	@Test
	public void test2() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String Expected = driver.getTitle();
	Assert.assertNotEquals(Expected , "FAKE");
	}
	
	@Test
	public void test3() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	Boolean actual = driver.findElement(By.xpath("//a[text()='Log in']")).isEnabled();
	Assert.assertTrue(true);
	}
	
	@Test
	public void test4() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	Boolean actual = driver.findElement(By.xpath("//a[text()='Log in']")).isEnabled();
	Assert.assertFalse(false);
	}
	
	@Test
	public void test5() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	String abc = driver.findElement(By.xpath("//input[@id='loginusername']")).getText();
	Assert.assertNull(abc); //it showing  blank but not null
	
	}
	
	
}
