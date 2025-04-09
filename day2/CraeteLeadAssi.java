package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CraeteLeadAssi {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Railway");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tanu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		
		WebElement leadOption=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dropdown=  new Select (leadOption);
		dropdown.selectByIndex(5);
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("CraeteLead");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	driver.close();
			
	}

}
