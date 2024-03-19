package webdriveruniversitypack.webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mavendropdownclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Select droplang= new  Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
		//droplang.selectByVisibleText("JAVA");
		//droplang.selectByValue("SQL");
		//droplang.selectByIndex(2);
		Select droplang2 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
		//droplang2.selectByVisibleText("Eclipse");
		//droplang2.selectByValue("Maven");
		//droplang2.selectByIndex(2);
		Select droplang3 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
		//droplang3.selectByVisibleText("HTML");
		//droplang3.selectByValue("CSS");
		//droplang3.selectByIndex(2);
		//WebElement check1 =driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
		//check1.click();
		//check1.clear();
		//WebElement check2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
		//check2.click();
		//check2.clear();
		//WebElement check3 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input"));
		//check3.click();
		//WebElement check4 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
		//check4.click();
		//check4.clear();
		//WebElement radio1= driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[1]"));
		//radio1.click();
		//WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
		//radio2.click();
		//WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
		//radio3.click();
		//WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[4]"));
		//radio4.click();
		//WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
		//radio5.click();
		//WebElement lettuce = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
		//lettuce.click();
		//WebElement pumpkin = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]"));
		//pumpkin.click();
		//Select dropfruit = new Select (driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]")));
		//dropfruit.selectByVisibleText("Grape");
		//Select dropfruit = new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]"));
		//dropfruit.selectByValue("Pear");
		Select dropfruit = new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")));
		dropfruit.selectByIndex(2);
		

	}

}
