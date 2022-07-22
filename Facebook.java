package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		//setup the path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//launch the url
		driver.get("https://en-gb.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click new account
		driver.findElement(By.partialLinkText("New Account")).click();
		//enter first name
		driver.findElement(By.name("firstname")).sendKeys("The name is Ajith");
		//enter last name/surname
		driver.findElement(By.name("lastname")).sendKeys("Kumar S");
		//enter mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		//enter password
		driver.findElement(By.id("password_step_input")).sendKeys("MyAccount@123");
		//handling three drop downs
		//selecting date
		WebElement day = driver.findElement(By.id("day"));
		Select drop = new Select(day);
		drop.selectByIndex(29);
		//selecting month
		WebElement month = driver.findElement(By.id("month"));
		Select drop1 = new Select(month);
		drop1.selectByVisibleText("Jun");
		//selecting year
		WebElement year = driver.findElement(By.id("year"));
		Select drop2 = new Select(year);
		drop2.selectByValue("1998");
		//select radio button
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//current page title
		String title = driver.getTitle();
		System.out.println(title);
		//signup
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
	}

}
