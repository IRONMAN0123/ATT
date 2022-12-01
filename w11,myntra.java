package week11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\student\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");
	    WebElement glink=driver.findElement(By.name("q"));
	    glink.sendKeys("Myntra");
	    glink.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    WebElement mlink=driver.findElement(By.xpath("//h3[normalize-space()='Myntra: Online Shopping for Women, Men, Kids Fashion ...']"));
	    mlink.click();
	    WebElement pro=driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
	    pro.click(); 
	    WebElement Login=driver.findElement(By.xpath("//a[normalize-space()='login / Signup']"));
	    Login.click();
	    Thread.sleep(2000);
	    WebElement num=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/input"));
	    num.sendKeys("8074662205");
	    WebElement con=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[3]"));
	    con.click();

	}

}
