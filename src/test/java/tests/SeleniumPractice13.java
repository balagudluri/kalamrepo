package tests;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice13{
	
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.gmail.com");
		
		Thread.sleep(5000);
		
		URL obj = new URL("https://www.amazon.com");
		
		driver.navigate().to(obj);
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
	}
}