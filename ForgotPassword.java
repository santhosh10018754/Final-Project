package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/index.php"); 
		
		//Clicking On Build 2
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[2]/td/ul/li[2]/a")).click();
		driver.manage().window().maximize();
		
		//Forgot Password
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[4]/td[2]/div/a")).click();
		
		//Entering Email
		driver.findElement(By.id("emailadd_recovery")).sendKeys("admiralsanthosh2201@gmail.com");
		
		
		 driver.findElement(By.className("reg_button")).click();
		 
		 //If Email is Valid Message will be send to Mail ID
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")).click();
		System.out.println("New password is sent to your Email");
		
		//If Invalid Email re-enter valid Email
		//driver.findElement(By.id("Reset")).click();
		 
		
		//Go Back to login page
		//driver.findElement(By.xpath("//*[@id=\'passre_form\']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a")).click();
	
	}

}
