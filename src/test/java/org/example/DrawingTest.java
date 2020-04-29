package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class DrawingTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void seleniumExampleTest() throws InterruptedException {
        driver.manage().window().maximize();
        sleep(2000);
        driver.get("https://www.youidraw.com/apps/painter/");
        sleep(1000);
        Actions action = new Actions(driver);
        sleep(1000);
        action.moveByOffset( 50, 50).clickAndHold().moveByOffset(50,50).perform();
        sleep(1000);
    }

    @After
    public void tearDown() {
        driver.close();
    }


}
