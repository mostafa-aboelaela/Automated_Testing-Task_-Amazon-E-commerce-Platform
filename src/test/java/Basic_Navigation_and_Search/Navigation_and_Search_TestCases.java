package Basic_Navigation_and_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigation_and_Search_TestCases {

    public static ChromeDriver driver;

    @BeforeMethod
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/");
        driver.manage().window().maximize();

    }

    @Test
   void test_a(){
        WebElement searchBar = driver.findElement(By.id("nav-search-submit-button"));
        Assert.assertTrue(searchBar.isDisplayed(), "Search bar is not displayed!");

        WebElement menu = driver.findElement(By.id("nav-hamburger-menu"));
        Assert.assertTrue(menu.isDisplayed(), "Menu is not displayed!");
         WebElement cartIcon = driver.findElement(By.id("nav-cart-count"));
         Assert.assertTrue(cartIcon.isDisplayed(),"Cart icon is not displayed!");
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
