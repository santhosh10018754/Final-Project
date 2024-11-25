package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookedItineraryAndCancel {

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
		
		//Checking for Booked Itinerary Page
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
		
		//search order id
		driver.findElement(By.id("order_id_text")).sendKeys("3ZVDU88J5O");
		driver.findElement(By.id("search_hotel_id")).click();
		//selecting Booked Order
		driver.findElement(By.name("ids[]")).click();
		//canceling Booked order 
		driver.findElement(By.className("reg_button")).click();
			
		//The user has to manually click on OK button for Canceling the Booking
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//*[@id=\'search_result_error\']")) != null) {
			System.out.println("Selected booking Are cancelled.");
		}
		else {
			System.out.println("0 results found ");
		}
	}

}
