package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.google.co.in");
		
		Thread.sleep(5000);
		
		//By obj = By.name("q");
		
		//driver.findElement(obj).sendKeys("Abdul Kalam sir");
		
		WebElement e = driver.findElement(By.name("q"));
		
		e.sendKeys("abdul kalam sir");
		
		e.submit();
	}

}
