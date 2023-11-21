package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 *
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 *
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 *
 * 3. verifyTheErrorMessage
 *
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

//Write down the testcase
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        WebElement link = driver.findElement(By.linkText("Log in"));
        link.click();
        String expectedText = "Welcome, Please Sign In!";
        //Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Click on the Login and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
       loginLink.click();

        //Find the Email Field and type the Email address to email field
       WebElement emailField = driver.findElement(By.id("Email"));
       emailField.sendKeys("prime123@gmail.com");

       //Find the password field and type the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Prime123");
        //Find the login button element and click
      WebElement loginButton =  driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
      loginButton.click();

      WebElement logOutLink = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
      String expected = "Log out";
      Assert.assertEquals(expected, logOutLink.getText());


    }
    @Test
    public void verifyTheErrorMessage(){


        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // find the email field and type the email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");
        // find the password field and type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        // find the login button and click
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";


        // Find the errorMessage element
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Test case pass", expectedErrorMessage, actualErrorMessage);
    }


    @After
    public void tearDown(){
        closeBrowser();
    }

}

