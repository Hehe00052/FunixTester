import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyStoreAutomation {
    private WebDriver driver;
    private String URL = "https://automationexercise.com/products";
    private String keyword = "Stylish Dress";

    @BeforeClass
    public void setup() {
    	System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
//        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void TC_MyOrderSearchValid()throws Exception {
    	driver.get(URL);
    	// Khởi tạo đối tượng để thực hiện các tương tác trên trang
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	Actions action = new Actions(driver);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
        // Step 1: Access the URL and wait for page to load        
     // Verify if the input search element is displayed
        WebElement inputSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
        
        // Step 2: Enter keyword and click on the search icon
        action.sendKeys(inputSearch, keyword).build().perform();
        
        WebElement btnSearch = driver.findElement(By.id("submit_search"));
        btnSearch.click();
        
        WebElement resultMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='features_items']/h2")));
        Assert.assertTrue(resultMessage.isDisplayed(), "Search failed");
        action.click().build().perform();
        
        // Verify product image is displayed
        WebElement productImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='single-products']/div[1]/img")));
        Assert.assertTrue(productImage.isDisplayed(), "Product image not displayed");

        // Verify Add to cart button is displayed
        WebElement btnAddToCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='single-products']/div[1]/a")));
        Assert.assertTrue(btnAddToCart.isDisplayed(), "Add to cart button not displayed");

        // Step 3: Add product to cart
        js.executeScript("arguments[0].scrollIntoView();",btnAddToCart);
//        action.sendKeys(Keys.PAGE_DOWN).build().perform();
//        Thread.sleep(2000);
        btnAddToCart.click();
        Thread.sleep(2000);
        // Wait for the add response message to be displayed
        WebElement addResponseMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-content']/div[2]/p[1]")));
        String actual = addResponseMsg.getText();

        // Expected message
        String expected = "Your product has been added to cart.";

        // Compare the actual and expected messages
        Assert.assertEquals(actual, expected, "Add to cart message doesn't match.");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
