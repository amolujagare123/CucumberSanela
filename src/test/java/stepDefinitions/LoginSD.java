package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {

    WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net/");


    }

    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password");
    }

    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        System.out.println("I click on login button");

        Thread.sleep(5000);
        driver.findElement(By.name("submit")).click();

    }

    @Then("I should be on home page")
    public void i_should_be_on_home_page() {
        System.out.println("I should be on home page");
    }

    @When("I enter incorrect username and password")
    public void i_enter_incorrect_username_and_password() {
        System.out.println("I enter incorrect username and password");
    }


    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {

        System.out.println("Username & passwords rntered as below");
        System.out.println(username+" "+password);

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);


    }

}
