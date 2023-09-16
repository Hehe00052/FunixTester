package lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lab5 {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
    }

    @Test
    public void TC01_GoogleSearch() {
        driver.get("https://www.google.com.vn/");

        WebDriverWait wait = new WebDriverWait(driver, 15);

        WebElement inputSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        inputSearch.sendKeys("selenium");

        WebElement btnSearch = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        btnSearch.click();

        // Wait for search results page to load (you can add more assertions here)
        wait.until(ExpectedConditions.titleContains("selenium"));
    }

    @AfterClass
    public void teardown() {
        //driver.close();
    }
}
