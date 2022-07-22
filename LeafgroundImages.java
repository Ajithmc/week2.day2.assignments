package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundImages {
	public static void main(String[] args) {
		//setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leafground.com/pages/Image.html");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on image to go home page
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[1]")).click();
		driver.findElement(By.xpath("//h5[text()='Image']")).click();
		//to check the image is broken
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[2]"));
		
		//clickme using mouse or keyboard
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[3]")).click();
		
	}

}
