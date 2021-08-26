package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     
     driver.findElement(By.id("username")).sendKeys("admin");
     Thread.sleep(2000);
     driver.findElement(By.name("pwd")).sendKeys("manager");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()='Login ']")).click();
     Thread.sleep(5000);
     String title = driver.getTitle();
     System.out.println(title);
     
     String url = driver.getCurrentUrl();
     System.out.println(url);
     
     if(title.equals("actiTIME - Enter Time-Track")) {
    	 System.out.println("Pass:Home page is dispalyed");
     }
     else
     {
    	 System.out.println("Fail:home page is not disaplyed");
     }
     
     driver.close();


	}

}
