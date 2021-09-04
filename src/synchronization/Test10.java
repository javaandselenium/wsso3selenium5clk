package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	while(true) {
		try {
	driver.findElement(By.name("username")).sendKeys("admins");
	break;
	}
		catch(Exception e) {
			System.out.println("element not found");
		}
	
		

	}

	}}
