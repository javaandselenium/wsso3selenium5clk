package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.myntra.com/");
     
     driver.navigate().to("https://skillrary.com/");
     Thread.sleep(3000);
     driver.navigate().back();
     
     Thread.sleep(3000);
     
     driver.navigate().forward();
     
     Thread.sleep(3000);
     
     driver.navigate().refresh();
     
     Thread.sleep(3000);
     
     driver.close();


	}

}
