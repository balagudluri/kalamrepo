package tests;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Scanner;

public class SeleniumPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		System.out.println("Enter site url");
		String url = sc.nextLine();
		sc.close();
		
		RemoteWebDriver driver = null;
		
		if(bn.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("wrong browser name");
		}
		
		driver.get(url);

	}

}
