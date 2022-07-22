package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		//setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");//load the url
		driver.manage().window().maximize();//maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicit wait
		//go to home page
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("//h5[text()='Button']")).click();//click button
		//get position
		System.out.println(driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation());
		//what colour am i
		System.out.println(driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color"));
		//get size
		System.out.println(driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize());
		//get title
		System.out.println(driver.getTitle());
		//close browser
		driver.close();
		
		
		
	}

}
