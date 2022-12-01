package exp9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exp9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/Rangareddy/Bakeries-in-Kandlakoya/nct-10033880");
	    List<WebElement> list=driver.findElements(By.xpath("//h2[@class=\"store-name\"]"));
		for(int i=0; i<list.size();i++)
		{
			String bname=list.get(i).getText ();
			System.out.println("Bakery Name : "+bname);
		}
         driver.quit();
	}

}
