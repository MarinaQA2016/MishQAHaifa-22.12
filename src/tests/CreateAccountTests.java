package tests;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void CreateNewAccount() throws InterruptedException {
        WebElement goToEventList = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Go to Event list')]"), 40);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(RandomString.make(9) + "@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");
        Thread.sleep(5000);

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();


        //WebElement cancelButton = driver
          //      .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        //cancelButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@mattooltip='Menu']"), 40);
        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));

        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver, By.xpath("//button[@class='mat-stroked-button']"), 40);

        Assert.assertTrue(goToEventList.getText().equals("Go to Event list"));

    }
    @Test
    public void CreateNewAccountAndLogIn() throws InterruptedException {
        WebElement goToEventList = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Go to Event list')]"), 40);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        String mail2 = RandomString.make(9)+ "@gmail.com";
        mailField.click();
        mailField.sendKeys(mail2);


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");
        Thread.sleep(5000);

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();


        //WebElement cancelButton = driver
        //      .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        //cancelButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@mattooltip='Menu']"), 40);
        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));

        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver, By.xpath("//button[@class='mat-stroked-button']"), 40);

        Assert.assertTrue(goToEventList.getText().equals("Go to Event list"));

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys(mail2);
        Thread.sleep(4000);

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Log in')]"),30);
        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
        WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));

    }

}
