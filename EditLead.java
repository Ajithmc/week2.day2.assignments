package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		//setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
		//get title
		String title1 = driver.getTitle();
		System.out.println(title1);
		//crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//enter first name
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys("Ajith");
		//get Title
		System.out.println(driver.getTitle());
		//click find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//click first resulting lead
		driver.findElement(By.xpath("(//a[text()='Ajith'])[1]")).click();
		//verify title
		System.out.println(driver.getTitle());
		//click edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//change company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Grow with Leaf");
		//update 
		driver.findElement(By.xpath("(//input[@class ='smallSubmit'])[1]")).click();
		//close the browser
		driver.close();
		
	}

}
