package day21;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstProgram {
	
	public static void main(String[] args) {
		System.out.println("hello......");
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver1=new EdgeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		
		
		
		driver1.get("https://qa-app.testbolt.io");
		
		String SoftwareTitle = driver1.getTitle();
		if(SoftwareTitle.equals("Testbolt"))
		{
			System.out.println("Test Passes");
		}else
		{
			System.out.println("Test Failed");
		}
		
		driver1.close();
		//driver.quit();
		
	}

}
