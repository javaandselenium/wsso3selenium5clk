package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://en-gb.facebook.com/");
     
     driver.findElement(By.linkText("Forgotten password?")).click();
     driver.findElement(By.id("identify_email")).sendKeys("6755577577");
     driver.findElement(By.id("did_submit")).click();

	}

}
