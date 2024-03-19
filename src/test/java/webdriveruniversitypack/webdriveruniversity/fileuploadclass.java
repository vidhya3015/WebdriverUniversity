package webdriveruniversitypack.webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\AUTOMATION\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
		fileInput.sendKeys("C:\\Users\\DELL\\Downloads\\cartoongrl.jpeg");
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		Submit.click();
		driver.switchTo().alert().accept();
		//driver.close();

	}

}
