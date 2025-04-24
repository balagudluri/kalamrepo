package tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_intro.asp");
		
		Thread.sleep(5000);
		
		String whs = driver.getWindowHandle();
		System.out.println(whs);
		
		driver.close();
	}

}
