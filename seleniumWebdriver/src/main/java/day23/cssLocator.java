package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("apple");
		driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
		
		
		
		
		

	}

}
