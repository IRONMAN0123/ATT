package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\student\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
	WebElement fn=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/span"));
		fn.click();
		Thread.sleep(2000);
		WebElement ph=driver.findElement(By.xpath("//input[@type='text']"));
		ph.sendKeys("8074662205");
		Thread.sleep(2000);
		WebElement cn=driver.findElement(By.xpath("//input[@type='submit']"));
		cn.click();
		Thread.sleep(2000);
		WebElement otp=driver.findElement(By.xpath("//input[@type='tel']"));
		otp.sendKeys("8639");
		Thread.sleep(2000);
		WebElement shopping=driver.findElement(By.xpath("//input[@type='submit']"));
		shopping.click();
		Thread.sleep(2000);	
	}

}
