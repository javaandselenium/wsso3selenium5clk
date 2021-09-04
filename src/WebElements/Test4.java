package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
WebElement ele = driver.findElement(By.name("q"));	
Dimension s = ele.getSize();
int height = s.getHeight();
System.out.println("Height of the element "+height);
int width = s.getWidth();
System.out.println("width of the element "+width);

driver.close();
	}

}
