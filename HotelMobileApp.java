package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelMobileApp {

	public static void main(String[] args) {
		
		// Launch the ChromeDriver,Maximize the window and navigate to URL
				WebDriver driver=new ChromeDriver();   
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://adactinhotelapp.com/index.php"); 
				
				//Clicking On Build 2
				driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[2]/td/ul/li[2]/a")).click();
				driver.manage().window().maximize();
				

				//Entering Username,password for Login
				driver.findElement(By.id("username")).sendKeys("Santhojai");
				driver.findElement(By.id("password")).sendKeys("Sandy@2701");
				driver.findElement(By.id("login")).click();
				
				//Checking for Download Mobile App Option 
				driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[3]/table/tbody/tr[1]/td/a")).click();
				System.out.println("You are in Mobile download page");
				
				
				
				

	}

}
