package org.maven;

import java.sql.Driver;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTask {

	public static WebDriver driver;

	public void lanch()
	{
		String path = ".//driver//chromedriver.exe";  
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}

	public void url()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	public void getsech() throws InterruptedException
	{
		driver.findElement(By.xpath("(//button)[2]")).click();
		WebElement ser = driver.findElement(By.xpath("//input[@type='text']"));
		ser.sendKeys("redmi mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button")).click();

	}

	public void tex() throws InterruptedException
	{

		Thread.sleep(3000);
		for (int i = 3; i < 26; i++) {

			int cout=0;
			LinkedList<Object> l = new LinkedList<Object>();
			String p = driver.getWindowHandle();
			WebElement t = driver.findElement(By.xpath("(//div[contains(text(),'Redmi') or contains(text(),'REDMI') ])["+i+"]"));
			l.add(t);
			
		}
/*
		WebElement t = driver.findElement(By.xpath("(//div[contains(text(),'Redmi') or contains(text(),'REDMI') ])"));
		t.click();
		String p = driver.getWindowHandle();
		Set<String> y = driver.getWindowHandles();

		for (String x : y) 
		{
			if(p.equals(x))
			{

			}
			if(!p.equals(x))
			{
				driver.switchTo().window(x);
			}
		}*/


		/*WebElement saa = driver.findElement(By.xpath("//span[starts-with(text(),'Redmi')]"));
		Thread.sleep(3000);
		String ssaa = saa.getText();
		System.out.println(ssaa);

		WebElement b = driver.findElement(By.xpath("(//div[starts-with(text(),'Redmi')])[3]"));
		String sb = b.getText();
		System.out.println(sb);*/
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DemoTask obj = new DemoTask();
		obj.lanch();
		obj.url();
		obj.getsech();
		obj.tex();
		//driver.close();
		
		int k=36;
		for (int i = 0; i < 36; i++) {
			
		}
	}

}
