package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

   EdgeDriver driver= new EdgeDriver();
   driver.get("https://en-gb.facebook.com/");
   
   driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
   driver.findElement(By.id("pass")).sendKeys("Tuna@321");
   	
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	
}
}
