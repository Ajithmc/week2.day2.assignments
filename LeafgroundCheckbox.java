package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheckbox {

	public static void main(String[] args) {
		//setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leafground.com/pages/checkbox.html");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//select the languages
		WebElement java = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));	
		java.click();
		
		//confirm the checkbox is selected
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
			selenium.isSelected();	
		
		//deselect only checked
		WebElement deSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
				
		if(deSelect.isSelected()) {
			deSelect.click();
			
		}
		
		//select all checkboxes
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		option1.click();
		
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		option2.click();
		
		WebElement option3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		option3.click();
		
		WebElement option4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		option4.click();	
		
		WebElement option5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		option5.click();
		
		WebElement option6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		option6.click();
	}
}

