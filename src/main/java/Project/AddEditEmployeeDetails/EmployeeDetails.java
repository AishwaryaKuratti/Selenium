package Project.AddEditEmployeeDetails;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeDetails {

		public static class LoginTest {
		
		static WebDriver driver =null;
		
		
		
		@BeforeMethod
		public void openBrowser() {
			//To set the browser property
			System.setProperty("webdriver.chrome.driver","./chromedriver_win32/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//To maximize the Browser
			driver.manage().window().maximize();
			
			//Apply Implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@AfterMethod
		public void closeBrowser() {
			//To close the browser after the task in done
			driver.quit();
		}
		
		
		@Test
		public static void LoginOrangeHRM() throws Exception {
				
		//To open the orangehrmlive.com site
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//To add the login details
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		//To add the password
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		//To click on Login in button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//To click on PIM button
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		
		//To click on Add Employee Page
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		
		//To fill first name of the user in text box
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Priya");
		
		//To fill last name of the user in text box
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Shah");
		
		//To fill the employee ID, we first clear the auto text and then add ID
		driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("257457809");
		
		
		//To click on save button
		driver.findElement(By.xpath("//input[@id='chkLogin']")).click();
		
		
		//To fill the user name and password details
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("priyashah");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("priyashah123");
		driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("priyashah123");
		
		//To select the Enabled option from the status drop down menu
		Select drpstatus=new Select(driver.findElement(By.name("status")));
		drpstatus.selectByVisibleText("Enabled");
		
		//To select save button
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		//To select Edit button
		driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/p[1]/input[1]")).click();
		
		Thread.sleep(5000);
		
		//To select Nationality as Indian from the drop down menu
		Select drpnationality=new Select(driver.findElement(By.name("personal[cmbNation]")));
		drpnationality.selectByVisibleText("Indian");
		Thread.sleep(5000);
		
		//To select gender as female from the radio button
		driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
		Thread.sleep(5000);
		
		//To add the Date of Birth
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys("1998-01-05");
		
		Thread.sleep(5000);
		
		//To click on the Save button
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
						
		Thread.sleep(5000);
		
		//To display the process is submitted in console 
		System.out.println("Submitted");
		
		
	}

		
		 

}

		

	
}
