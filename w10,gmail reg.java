package exp10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(2000);
		WebElement cn=driver.findElement(By.xpath("//span[normalize-space()='Create account']"));
		cn.click();
		Thread.sleep(2000);
		WebElement personal=driver.findElement(By.xpath("//span[normalize-space()='For my personal use']"));
		personal.click();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("Harsha");
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Mysore");
		WebElement uname = driver.findElement(By.name("Username"));
		uname.sendKeys("8074662205s");
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("harsha123s");
		WebElement cpass = driver.findElement(By.name("ConfirmPasswd"));
		cpass.sendKeys("harsha123s");
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        submit.click();
        Thread.sleep(2000);
        WebElement mobile=driver.findElement(By.id("phoneNumberId"));
        mobile.sendKeys("8074662205");
        WebElement submit1=driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        submit1.click();
	}

}
