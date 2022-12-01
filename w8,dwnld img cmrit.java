package week8;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week8 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("axis");
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.get("https://www.google.com/search?q=axis&rlz=1C1YTUH_enIN1007IN1007&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjvmKm-web6AhVuTWwGHZc5CBgQ_AUoA3oECAIQBQ&biw=1920&bih=916&dpr=1");
		Thread.sleep(3000);
		WebElement Image = driver.findElement(By.xpath("//img[@alt='Axis Bank - Home | Facebook']"));
		Actions action = new Actions(driver);
		action.contextClick(Image).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		System.out.println("downloaded");
		
	}

}
