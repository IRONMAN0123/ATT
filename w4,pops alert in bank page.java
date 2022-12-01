package exp4;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class week4 {
	public static void main(String [] args) throws InterruptedException{
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs",prefs);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\student\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com");
		Thread.sleep(2000);
		WebElement popupClose = driver.findElement(By.xpath("/html[1]/body[1] /div[1]/div[1]/div[1]"));
		popupClose.click();
		driver.close();
		Thread.sleep(2000);
	}
}






