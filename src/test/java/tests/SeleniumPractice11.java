package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_intro.asp");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Set<String> whl = driver.getWindowHandles();
		System.out.println(whl);
		
		driver.quit();
		
		
	}

}
