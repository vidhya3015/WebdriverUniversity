package webdriveruniversitypack.webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavencontactclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		WebElement firstname= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		firstname.sendKeys("Vidhya");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		lastname.sendKeys("Vijayan");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		email.sendKeys("vidhyavijayan716@gmail.com");
		WebElement comments=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		comments.sendKeys("good");
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		submit.click();
		//driver.close();

	}

}
