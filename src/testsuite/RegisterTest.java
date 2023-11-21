package testsuite;
/**
 * Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 *
 * 2. userShouldRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";
    // Need to set up only once
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
      @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
          String expectedMessage = "Register";
          WebElement register = driver.findElement(By.linkText("Register"));
          register.click();
          WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
          String actualMessage = actualMessageElement.getText();
         Assert.assertEquals(expectedMessage, actualMessage);

      }


    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        //click on the register link
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class ='ico-register']")).click();
        Thread.sleep(3000);
        //Select gender radio button
        driver.findElement(By.xpath("//label[@for='gender-female']"));
        Thread.sleep(3000);
        //Enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Thomas");
        Thread.sleep(3000);
        //Enter last name
        driver.findElement(By.name("LastName")).sendKeys("Daniel");
        Thread.sleep(3000);
        //Select Day, Month and year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("14");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("5");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1994");
        Thread.sleep(3000);
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys(+ randomInt + "@gmail.com");
        Thread.sleep(3000);
        //Enter Password
        driver.findElement(By.name("Password")).sendKeys("xyz456");
        Thread.sleep(3000);
        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz456");
        Thread.sleep(3000);
        //Click on Register button
        driver.findElement(By.id("register-button")).click();

        String expectedText = "Your registration completed";

        //Verify the text 'Your registration completed
       String actualText =  driver.findElement(By.xpath("//div[@class='result']")).getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
