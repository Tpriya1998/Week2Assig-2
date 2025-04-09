package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Click on Create new Account
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mona");
		driver.findElement(By.name("lastname")).sendKeys("Sinha");
		
		//Select dropdown for date
		WebElement fbOption= driver.findElement(By.id("day"));
		Select dropdown = new Select(fbOption);
		dropdown.selectByIndex(5);
		
		// Select dropdown for month 
		WebElement fbOption1=driver.findElement(By.id("month"));
		Select dropdown1 = new Select(fbOption1);
		dropdown1.selectByIndex(5);
		 
		//Select dropdown for Year
		WebElement optionYear = driver.findElement(By.id("year"));
		 Select dropdown2 = new Select(optionYear);
		 dropdown2.selectByIndex(20);
		 
		 
		 // Select Radio button
		 
		 driver.findElement(By.name("sex")).click();
		 
		 
		 driver.findElement(By.name("reg_email__")).sendKeys("tanupriya2907@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("Tuna321");
		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				
		
	}

}
