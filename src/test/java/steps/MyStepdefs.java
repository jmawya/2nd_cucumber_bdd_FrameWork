package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class MyStepdefs {

    WebDriver driver;
    @Given("Student at talentek homepage")
    public void studentAtTalentekHomepage() {
      driver=new ChromeDriver();
        driver.get("https://qa.taltektc.com/");

        driver.manage().window().maximize();

    }

    @And("Student enter valid e-mail address")
    public void studentEnterValidEMailAddress() {

        driver.findElement(By.name("email")).sendKeys("jmakldjf@gmail.com");


    }


    @And("Student enter valid password")
    public void studentEnterValidPassword() {
        driver.findElement(By.name("password")).sendKeys("Abdc123456789");

    }

    @When("they click on log in button")
    public void theyClickOnLogInButton() throws InterruptedException {
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
         Thread.sleep(1500);
    }


    @Then("Student should be able to successfully login")
    public void studentShouldBeAbleToSuccessfullyLogin() {
        String exp="Student Information";
        String act=driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div/div[1]/h2")).getText();
        Assert.assertEquals(act,exp);
    }


    @And("Student enter invalid e-mail address")
    public void studentEnterInvalidEMailAddress() {
        driver.findElement(By.name("email")).sendKeys("jmakldjerf@gmail.com");
    }

    @Then("Student should not be able to successfully login with invalid e-mail")
    public void studentShouldNotBeAbleToSuccessfullyLoginWithInvalidEMail() {
        String exp="Invalid email address";
        String act=driver.findElement(By.xpath("//*[@id=\"error-msg\"]")).getText();
        Assert.assertEquals(act,exp);
    }

    @And("Student enter invalid password")
    public void studentEnterInvalidPassword() {
        driver.findElement(By.name("password")).sendKeys("Abdc1234fff56789");
    }

    @Then("Student should not be able to successfully login with invalid password")
    public void studentShouldNotBeAbleToSuccessfullyLoginWithInvalidPassword() {
        String exp="Incorrect email or password";
        String act=driver.findElement(By.xpath("//*[@id=\"error-msg\"]")).getText();
        Assert.assertEquals(act,exp);
    }

    @Then("Student should not be able to successfully login with invalid credential")
    public void studentShouldNotBeAbleToSuccessfullyLoginWithInvalidCredential() {
        String exp="Invalid email address";
        String act=driver.findElement(By.xpath("//*[@id=\"error-msg\"]")).getText();
        Assert.assertEquals(act,exp);

    }
}
