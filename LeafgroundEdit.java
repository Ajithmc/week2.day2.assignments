package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//setup
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html"); //load the url
		driver.manage().window().maximize();//maximize the window
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter the email
		driver.findElement(By.id("email")).sendKeys("ajithak29698@gmail.com");
		//append and press tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Text",Keys.TAB);
		//driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		//get default text
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		//clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		//confirm whether the edit field is disabled
		System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
		
		
		
	}

}
