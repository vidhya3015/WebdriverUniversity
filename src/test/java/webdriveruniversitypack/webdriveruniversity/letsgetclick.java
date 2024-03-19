package webdriveruniversitypack.webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class letsgetclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		WebElement clickme=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		clickme.click();
		//WebElement clickme2=driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		//clickme2.click();
		//WebElement clickme3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		//clickme3.click();

			}

}


	


