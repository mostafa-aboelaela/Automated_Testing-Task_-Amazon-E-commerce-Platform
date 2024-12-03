package Basic_Navigation_and_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_To_Cart {
    public static ChromeDriver driver;
    @BeforeMethod
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/");
        driver.manage().window().maximize();
    }

    @Test

    void test_a(){
        WebElement searchbarInput = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        searchbarInput.sendKeys("headphones");
        searchbarInput.submit();

        WebElement firstProduct = driver.findElement(By.xpath("//div[@class=\"a-section aok-relative s-image-square-aspect\"]"));
        WebElement firstProduct1 = firstProduct;
        firstProduct1.click();

        WebElement element = driver.findElement(By.xpath("//span[@id=\"submit.buy-now\"]"));
        element.click();

        WebElement loginForm = driver.findElement(By.xpath("//div[@class=\"a-box-inner a-padding-extra-large\"]"));
        Assert.assertTrue(loginForm.isDisplayed(), "Login prompt did not appear!");

        WebElement emailInput = driver.findElement(By.id("ap_email"));
        emailInput.sendKeys("aboelaela20@gmail.com");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement passwordInput = driver.findElement(By.id("ap_password"));
        passwordInput.sendKeys("شةشئخى2020");

        WebElement loginButton = driver.findElement(By.id("auth-signin-button"));
        loginButton.click();



    }


   @AfterMethod
    public void tearDown() {
       if (driver != null) {
           driver.quit();
        }
    }
}

