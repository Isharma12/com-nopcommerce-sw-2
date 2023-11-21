package testsuite;
/**
 * Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 *
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 *
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 *
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 *
 * 3. userShouldNavigateToApparelPageSuccessfully
 *
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 *
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 *
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 *
 * 6. userShouldNavigateToJewelryPageSuccessfully
 *
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 *
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";
    // Need to set up only once
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Click on the 'Computer' tab
        String expectedMessage = "Computers";
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() ='Computers ']")).click();
        WebElement getMessage = driver.findElement(By.xpath("//h1"));
        String actualMessage = getMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        String expectedMessage = "Electronics";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        WebElement getMessage = driver.findElement(By.xpath("//h1"));
        String actualMessage = getMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        String expectedMessage= "Apparel";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        WebElement getMessage = driver.findElement(By.xpath("//h1"));
        String actualMessage = getMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        String expectedMessage = "Digital downloads";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        WebElement getMessage = driver.findElement(By.xpath("//h1"));
        String actualMessage = getMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        String expectedMessage = "Books";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        WebElement getMessage = driver.findElement(By.xpath("//h1"));
        String actualMessage = getMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        String expectedMessage = "Jewelry";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        WebElement getMessage = driver.findElement(By.xpath("//h1"));
        String actualMessage = getMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        String expectedMessage = "Gift Cards";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        WebElement getMessage = driver.findElement(By.xpath("//h1"));
        String actualMessage = getMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @After
    public void tearDown(){
        closeBrowser();
    }


}
