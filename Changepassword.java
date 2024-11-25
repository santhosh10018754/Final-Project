package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Changepassword {

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

		//Clicking on Change password option
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[3]")).click();
		
		//Filling Credentials to change password
		driver.findElement(By.id("current_pass")).sendKeys("Sandy@2701");
		driver.findElement(By.id("new_password")).sendKeys("Sandy@2701");
		driver.findElement(By.id("re_password")).sendKeys("Sandy@2701");
		driver.findElement(By.name("change_password_Submit")).click();
		
		
		//If both current and new password conditions are satisfied
		System.out.println("your password is successfully updated");
		
		//If anyone of current and new password conditions are not satisfied
		//System.out.println("Please enter correct current password");
		
	}

}
