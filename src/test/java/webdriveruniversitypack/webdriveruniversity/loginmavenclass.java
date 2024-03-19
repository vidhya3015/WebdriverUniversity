package webdriveruniversitypack.webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginmavenclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("weddriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		username.sendKeys("vidhya123");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("12345");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		


	}

}
