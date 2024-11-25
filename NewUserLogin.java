package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v126.autofill.model.FillingStrategy;
import org.yaml.snakeyaml.events.Event.ID;

public class NewUserLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/index.php"); 
		
		//Clicking On Build 2
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[2]/td/ul/li[2]/a")).click();
		driver.manage().window().maximize();
		
		//click the New User Register for Registration
		driver.findElement(By.className("login_register")).click();
		
		//Filling Required Fields
		driver.findElement(By.id("username")).sendKeys("Santhoshyuvasr");
		driver.findElement(By.id("password")).sendKeys("Sandy@270104");
		driver.findElement(By.id("re_password")).sendKeys("Sandy@270104");
		driver.findElement(By.id("full_name")).sendKeys("Santhoshyuvar U");
		driver.findElement(By.id("email_add")).sendKeys("admiralsanthosh2301@gmail.com");
		
		
		//user needs to Enter the Captcha Manually
		//Please enter the Captcha Carefully
		
		Thread.sleep(10000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.className("reg_button")).click();
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")).click();
		
		String title=driver.getTitle();
		if (title.equals("Adactin.com - Hotel Reservation System"))
			System.out.println("You are in the Login page and proceed");
		    
		else
			System.out.println("Incorrect Page");
		/*
		If Captcha is wrong 
		driver.findElement(By.xpath("//*[@id=\'change-image\']/img")).click();
		
		If you want to Reset the Credentials 
		driver.findElement(By.id("Reset")).click();
		
		Go Back to Login page
		driver.findElement(By.xpath("//*[@id='register_form']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a")).click();
	*/
	}

}
