package webdriveruniversitypack.webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todolistmavenclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		WebElement  add_new=driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		add_new.sendKeys("Writing stories");
		add_new.sendKeys(Keys.ENTER);

	}

}

	


