package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sun.security.pkcs11.wrapper.CK_SSL3_KEY_MAT_OUT;

public class Test2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("gh-cat"));
		
		
		Select s=new Select(ele);
		s.selectByIndex(4);

		s.selectByValue("14339");

		s.selectByVisibleText("Dolls & Bears");
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		
		for(WebElement alloptions:opt) {
			System.out.println(alloptions.getText());
		}
		
s.deselectAll();
		driver.close();

	}

}
