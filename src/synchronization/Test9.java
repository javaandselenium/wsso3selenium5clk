package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		try {
		driver.get("https://www.instagram.com/accounts/login/");
		System.out.println("page is loaded");
		}
		catch(Exception e) {
			System.out.println("Page is not loaded");
		}

	}

}
