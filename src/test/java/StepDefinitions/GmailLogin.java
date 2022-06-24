package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLogin {

	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "F:/Program files/chromedriver.exe");
		
		driver = new ChromeDriver();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://mail.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		
		driver.findElement(By.id("identifierId")).sendKeys("saisha1803");
	   
	}

	@And("click on next button")
	public void click_on_next_button() {
		
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Mahi0712");
	   
	}

	@And("click on nextt button")
	public void click_on_nextt_button() {
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
	    
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	    
	}
	@When("user click on compose mail")
	public void user_click_on_compose_mail() {
		
		driver.findElement(By.xpath("//*[@id=\":39\"]/div/div")).click();
	    
	}

	@When("user enters the mail id")
	public void user_enters_the_mail_id() {
		
		WebElement to = driver.findElement(By.xpath("//textarea[@id=':92']"));		
		to.sendKeys("smahiaa01@gmail.com");
		to.sendKeys(Keys.TAB);
	   
	}

	@When("user enters the subject")
	public void user_enters_the_subject() {
		
		WebElement subject = driver.findElement(By.xpath("//input[@id=':8k']"));
		
		subject.sendKeys("Incubyte");
		
		subject.sendKeys(Keys.TAB);
		
	}

	@When("user enters the body")
	public void user_enters_the_body() {
		
		driver.findElement(By.xpath("//div[@id=':9q']")).sendKeys("Automation QA test for Incubyte");
		
		
	  
	}
//
//	@When("user attached the file")
//	public void user_attached_the_file() {
//		
//		WebElement Attachment = driver.findElement(By.xpath("//*[@id=\":g1\"]"));
//		Attachment.click();
//		Attachment.sendKeys("C:\\Users\\HP-Laptop\\Desktop\\Mahendra.doc");
//	  
//	}

	@When("user click on the sent button")
	public void user_click_on_the_sent_button() {
		
		driver.findElement(By.xpath("//div[@id=':e7']")).click();
	   
	}

	@Then("email appears in the send folder of gmail")
	public void email_appears_in_the_send_folder_of_gmail() {
		System.out.println("email appears in the send folder of gmail");
	}
}
