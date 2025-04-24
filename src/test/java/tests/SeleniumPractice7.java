package tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("page title is "+ title);
		String ps = driver.getPageSource();
		System.out.println("page source is "+ ps);
		driver.close();
	}

}
