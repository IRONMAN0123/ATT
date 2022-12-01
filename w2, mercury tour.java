package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		WebElement customerLogin = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'][normalize-space()='Customer Login'])[2]"));
		builder.moveToElement(customerLogin).perform();

		WebElement register = driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='Register'])[2]"));
		register.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement
				(By.name("first_name"));
		firstName.sendKeys("Harsha");
		
		WebElement lastName = driver.findElement
				(By.name("last_name"));
		lastName.sendKeys("Mysore");
		
		WebElement emailId = driver.findElement
				(By.id("acc_user_email"));
		emailId.sendKeys("mysoresriharsha07@gmail.com");
		
		
		WebElement setpassword = driver.findElement
				(By.id("acc_user_password"));
		setpassword.sendKeys("123456");
		
		
		WebElement confirmpassword = driver.findElement
				(By.id("acc_user_passconf"));
		confirmpassword.sendKeys("123456");
		
		
		WebElement mobileNumber = driver.findElement
				(By.id("acc_mobile_no"));
		mobileNumber.sendKeys("807466205");
		
		WebElement registerBtn = driver.findElement
				(By.xpath("(//button[normalize-space()='Register'])[1]"));
		registerBtn.click();
		Thread.sleep(10000);
		
		
		
		
		
	}

}
