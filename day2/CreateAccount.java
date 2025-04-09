package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Abcd123");
			driver.findElement(By.name("description")).sendKeys("Selenium is a UI automation framework to test web application.It is an open source automation testing tool,Selenium can work with all programing language ");
			//Creating Dropdown
			WebElement createAccount= driver.findElement(By.name("industryEnumId"));
			Select dropdown9 = new Select(createAccount);
			dropdown9.selectByIndex(3);
			//Select "S-Corporation" as ownership using SelectByVisibleText. 
			
			WebElement createAccount2= driver.findElement(By.name("ownershipEnumId"));
			Select dropdown6 = new Select(createAccount2);
			dropdown6.selectByVisibleText("S-Corporation");
			
			//Select "Employee" as the source using SelectByValue. 
			WebElement createAccount3 = driver.findElement(By.name("dataSourceId"));
			Select dropdown8 = new Select(createAccount3);
			dropdown8.selectByValue("LEAD_EMPLOYEE");
			
			//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
			
			WebElement createAccount4 = driver.findElement(By.name("marketingCampaignId"));
			Select dropdown11 = new Select (createAccount4);
			dropdown11.selectByIndex(6);
			
		//Select Texas as the state/ province using SelectByValue
			WebElement createAccount5 = driver.findElement(By.id("generalStateProvinceGeoId"));
			Select dropdown12 = new Select (createAccount5);
			dropdown12.selectByIndex(50);
			
			//Submit the Create Account

Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			//driver.close();
					
			
			
			
			
			
			
		
		
			
			

	}

}
