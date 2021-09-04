package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test8 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/accounts/login/");
//driver.manage().timeouts().implicitlyWait(3,TimeUnit.);



WebDriverWait w=new WebDriverWait(driver,5);

WebElement ele = driver.findElement(By.name("username"));

w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("hfhfhfhfhj");



WebElement btn = driver.findElement(By.xpath("//div[text()='Log In']"));
w.until(ExpectedConditions.elementToBeClickable(btn)).click();

String title = driver.getTitle();
w.until(ExpectedConditions.titleContains("hgghfghfgh"));



driver.findElement(By.name("password")).sendKeys("gyruggfgfgfhg");



	}

}
