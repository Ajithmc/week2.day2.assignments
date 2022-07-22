package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
				//click phone..
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				//enter phone number
				driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("99");
				//find leads
				driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
				//click on first resulting lead
				String leadID = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).getText();
				
				System.out.println(leadID);
				
				driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
			
				//click delete
				driver.findElement(By.linkText("Delete")).click();
				//click leads
				driver.findElement(By.linkText("Leads")).click();
				//click find leads
				driver.findElement(By.linkText("Find Leads")).click();
				//enter captured lead id
				driver.findElement(By.name("id")).sendKeys("10114");
				//click find leads
				driver.findElement(By.xpath("(//button[text()='Find Leads']//..)[2]")).click();
				//button[text()='Find Leads']
				driver.close();
	}

}
