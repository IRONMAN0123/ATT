package week12;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class week12 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("pdf to word converter");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//h3[normalize-space()='Convert PDF to Word online for free - iLovePDF']"));
		link.click();
		WebElement pickFiles = driver.findElement(By.id("pickfiles"));
		pickFiles.click();
		Thread.sleep(20000);
		Robot robot = new Robot();
		StringSelection filepath=new StringSelection("C:\\Users\\student\\Downloads\\20R01A66G8-Week 1.pdf\\");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement  submit = driver.findElement(By.id("processTaskTextBtn"));
		submit.click();
		Thread.sleep(5000);
		WebElement download = driver.findElement(By.id("pickfiles"));
		download.click();
	}
}
