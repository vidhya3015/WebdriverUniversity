package webdriveruniversitypack.webdriveruniversity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupalertsmavenclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		//WebElement javascript_click=  driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		//javascript_click.click();
		//driver.switchTo().alert().accept();
		//WebElement modal_click= driver.findElement(By.xpath("//*[@id=\"button2\"]/p"));
		//modal_click.click();
		//driver.switchTo().alert().dismiss();
		WebElement ajax_click= driver.findElement(By.xpath("//*[@id=\"button3\"]/p/a"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ajax_click.click();
		WebElement click_aj= driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		click_aj.click();
		//WebElement js_conform= driver.findElement(By.xpath("//*[@id=\"button4\"]/p"));
		// js_conform.click();
		 //driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		
		}

	}


	


