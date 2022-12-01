package internal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\student\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
		  Thread.sleep(2000);
		  WebElement fn=driver.findElement(By.name("firstname"));
		  fn.sendKeys("potturi");
		  WebElement ln=driver.findElement(By.name("lastname"));
		  ln.sendKeys("sravanthi");
		  WebElement mb=driver.findElement(By.name("reg_email__"));
		  mb.sendKeys("7674968738");
		  WebElement pswd=driver.findElement(By.name("reg_passwd__"));
		  pswd.sendKeys("sravanthi123@");
		 
		  Select bday=new Select(driver.findElement(By.name("birthday_day")));
		  bday.selectByValue("12");
		 
		  Select bm=new Select(driver.findElement(By.name("birthday_month")));
		  bm.selectByValue("02");
		 
		  Select byear=new Select(driver.findElement(By.name("birthday_year")));
		  byear.selectByValue("2003");
		 
		  WebElement male=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		  male.click();
		 
		  WebElement submit=driver.findElement(By.name("websubmit"));
		  submit.click();
	}

}
