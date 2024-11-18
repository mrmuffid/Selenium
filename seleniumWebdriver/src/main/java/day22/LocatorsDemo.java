package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		
		//name locator
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id locator
		boolean isDesplayed = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(isDesplayed);
		
		//LinkText locator
		//driver.findElement(By.linkText("Tablets")).click();
		
		//partialLinkText locator
		//driver.findElement(By.partialLinkText("Softw")).click();
		
		List<WebElement> linksBody = driver.findElements(By.className("list-inline-item"));
		
		System.out.println("hello");
		
		
		System.out.println(linksBody.size());
		
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		
		System.out.println(Images.size());
		
		
		driver.close();
		
		
		
		
		

	}

}
