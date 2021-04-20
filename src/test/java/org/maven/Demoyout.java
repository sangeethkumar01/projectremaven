package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoyout {
	
	public static WebDriver driver;
	
	public void lbyt()
	{
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public void urtl()
	{
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}

	public void run () throws InterruptedException
	{
		driver.findElement(By.id("search")).sendKeys("karnan");
		driver.findElement(By.xpath("(//button)[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("style-scope ytd-video-renderer")).click();
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3)[42]")).click();*/
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Demoyout obj = new Demoyout();
		obj.lbyt();
		obj.urtl();
		obj.run();
	}

}
