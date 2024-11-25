package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectHotelpage {

	public static void main(String[] args) throws InterruptedException {
	
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
		
		//Clicking on required details for Booking
		driver.findElement(By.id("location")).sendKeys("Sydney");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		driver.findElement(By.id("room_type")).sendKeys("Standard");
		driver.findElement(By.id("room_nos")).sendKeys("2");
		
		//By Default it shows today and tomorrow date 
		//User Needs to Change the date Occurding to their needs
		
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		Thread.sleep(10000);

		//driver.findElement(By.id("datepick_in")).sendKeys("24/11/2024");
		//driver.findElement(By.id("datepick_out")).sendKeys("25/11/2024");
		driver.findElement(By.id("adult_room")).sendKeys("2");
		driver.findElement(By.id("child_room")).sendKeys("2");
		driver.findElement(By.id("Submit")).sendKeys("Search");
		driver.findElement(By.id("Submit")).click();

		//Selecting the hotel for confirmation
		driver.findElement(By.xpath("//*[@id=\'radiobutton_0\']")).click();
		driver.findElement(By.id("continue")).click();
		
		String title3=driver.getTitle();
		if (title3.equals("Adactin.com - Book A Hotel"))
			System.out.println("You are in the payment page and proceed");
		else
			System.out.println("Incorrect Page");
		
		/* if Not satisfied with hotel and other properties 
		 driver.findElement(By.id("cancel")).click();
		 */
	}

}
