package StepDefinition;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;;

public class Step {
	
	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable{
        System.out.println("This Step open the Firefox and launch the application.");
        
        /*
         * mac OS の場合
         * 
         * （インストールコマンド）
         * brew tap homebrew/cask
         * brew cask install chromedriver
         */
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");					
        driver= new ChromeDriver();	
        driver.manage().window().maximize();		
        driver.get("http://demo.guru99.com/v4");
	}
	
	/*
	 * 何故か文字列を引数として認識しない
	 * https://github.com/cucumber/cucumber-jvm/issues/272
	 */
	//@When("^Enter the Username User(\\d+)and Password password(\\d+)$")
    @When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")				
    public void enter_the_Username_and_Password(String username, String password) throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");	

       driver.findElement(By.name("uid")).sendKeys(username);							
       driver.findElement(By.name("password")).sendKeys(password);	
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");	
        
        //driver.findElement(By.name("btnReset")).click();	
    }		
}
