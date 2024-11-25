package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {

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

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
		if (driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td")) != null) {
			System.out.println("You have successfully logged out. ");
		}
		driver.quit();
	}

}
