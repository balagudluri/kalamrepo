package tests;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_intro.asp");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Try it Yourself »")).click();
		
		Thread.sleep(3000);
		
		Set<String> whs = driver.getWindowHandles();
		
		List<String> whl = new ArrayList<>(whs);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(whl.get(1));

		driver.close();
	}

}
