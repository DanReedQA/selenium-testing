package org.example;

import com.sun.javafx.logging.JFRInputEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;

public class OnlineStoreExercise
{

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void searchDressesTest() throws InterruptedException {
        driver.manage().window().maximize();
        sleep(2000);
        driver.get("http://automationpractice.com/index.php");
        sleep(2000);
//        WebElement dressesButton = driver.findElement(By.partialLinkText("http://automationpractice.com/index.php?id_category=8&controller=catergory"));
////        Actions action = new Actions(driver);
////        sleep(1000);
////        dressesButton.click();
////        sleep(2000);
        WebElement searchBar = driver.findElement(By.className("search_query"));
        sleep(1000);
        searchBar.sendKeys("blouse");
        sleep(1000);
        searchBar.submit();
        sleep(1000);
        WebElement iconButt = driver.findElement(By.className("icon-th-list"));
        sleep(1000);
        iconButt.click();
        sleep(1000);
        WebElement addToKart = driver.findElement(By.className("button.ajax_add_to_cart_button.btn.btn-default"));
        sleep(1000);
        addToKart.click();
        sleep(2000);
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
