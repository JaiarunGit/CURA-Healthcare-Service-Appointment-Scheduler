package org.arun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
		"C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Enter the Url
		driver.get("https://katalon-demo-cura.herokuapp.com/");

		// Verify the Url
		String BrowserUrl = "https://katalon-demo-cura.herokuapp.com/";
		String currentUrl = driver.getCurrentUrl();

		if (BrowserUrl.equals(currentUrl)) {
			System.out.println("Valid Browser Url");

		} else {
			System.out.println("Invalid Browser Url");
		}

		// Click the MakeAppointment Button
		WebElement clkMakeAppointment = driver.findElement(By.id("btn-make-appointment"));
		clkMakeAppointment.click();

		// Find the UserName and UserPassword
		WebElement UserName = driver.findElement(By.id("txt-username"));
		UserName.sendKeys("John Doe");

		WebElement UserPassword = driver.findElement(By.id("txt-password"));
		UserPassword.sendKeys("ThisIsNotAPassword");

		// Click on Login Button
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();

		// Verify the Web Browser Go to the Dashboard

		String DashboardUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";
		String DashboardUrl1 = driver.getCurrentUrl();

		if (DashboardUrl.equals(DashboardUrl1)) {
			System.out.println("Valid Dashboard Url");

		} else {
			System.out.println("Invalid DashBoard Url");
		}

		// Click on MenuBar Button
		WebElement Menubar = driver.findElement(By.xpath("//a[@href='#']"));
		Menubar.click();
		Menubar.click();

		// Select the Facility Option Used by Select Class
		WebElement DropDown = driver.findElement(By.name("facility"));

		Select s = new Select(DropDown);
		s.selectByIndex(2);

		// Click the CheckBox for Apply hospital readmission
		WebElement CheckBox = driver.findElement(By.className("checkbox-inline"));
		CheckBox.click();

		// Click The Radio Button for Healthcare Program
		WebElement Radiobutton = driver.findElement(By.id("radio_program_medicaid"));
		Radiobutton.click();

		// Click on Date Table
		WebElement clktable = driver.findElement(By.id("txt_visit_date"));
		clktable.click();

		// Click Next Button
		WebElement clickButton = driver.findElement(By.xpath("//th[@class='next']"));
		clickButton.click();

		// Select Date 10/04/2024
		WebElement click10thDate = driver.findElement(By.xpath("(//td[contains(text(),'10')])[1]"));
		click10thDate.click();

		// Enter some Comments
		WebElement comment = driver.findElement(By.xpath("//textarea[@name='comment']"));
		comment.click();
		comment.sendKeys("Hii\nI am Jaiarunpraksh. It's an emergency please booking right now");

		// Click Book Appointment
		WebElement BookAppointment = driver.findElement(By.xpath("//button[@type='submit']"));
		BookAppointment.click();

		// Click Button Go to Home
		WebElement GoToHome = driver.findElement(By.xpath("//a[@class='btn btn-default']"));
		GoToHome.click();

		// Close the Browser
		driver.quit();

	}

}
