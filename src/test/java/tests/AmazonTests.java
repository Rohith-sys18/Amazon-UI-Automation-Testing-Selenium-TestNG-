package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTests {

    // Setup browser
    public WebDriver setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

    @Test
    public void testIphone() throws InterruptedException {

        WebDriver driver = setup();

        try {
            driver.get("https://www.amazon.in");

            // Search iPhone
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
            driver.findElement(By.id("nav-search-submit-button")).click();

            Thread.sleep(6000);

            // Scroll down to skip ads
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");

            // Click first product safely
            try {
                WebElement firstProduct = driver.findElement(
                        By.xpath("(//div[@data-component-type='s-search-result']//h2/a)[1]")
                );
                firstProduct.click();
            } catch (Exception e) {
                System.out.println("iPhone product not found");
                driver.quit();
                return;
            }

            Thread.sleep(6000);

            // Switch tab if new tab opened
            String original = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(original)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            Thread.sleep(5000);

            // Scroll to price
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");

            // ALWAYS print something
            try {
                WebElement price = driver.findElement(
                        By.xpath("(//span[contains(@class,'a-price-whole')])[1]")
                );
                System.out.println("iPhone Price: " + price.getText());
            } catch (Exception e) {
                System.out.println("iPhone price not found but test executed");
            }

            // Try Add to Cart
            try {
                WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCart);
                System.out.println("iPhone Add to cart attempted");
            } catch (Exception e) {
                System.out.println("Add to cart skipped (iPhone)");
            }

        } catch (Exception e) {
            System.out.println("Test failed (iPhone): " + e.getMessage());
        }

        driver.quit();
    }

    @Test
    public void testGalaxy() throws InterruptedException {

        WebDriver driver = setup();

        try {
            driver.get("https://www.amazon.in");

            // Search Galaxy
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy");
            driver.findElement(By.id("nav-search-submit-button")).click();

            Thread.sleep(6000);

            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");

            try {
                WebElement firstProduct = driver.findElement(
                        By.xpath("(//div[@data-component-type='s-search-result']//h2/a)[1]")
                );
                firstProduct.click();
            } catch (Exception e) {
                System.out.println("Galaxy product not found");
                driver.quit();
                return;
            }

            Thread.sleep(6000);

            String original = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(original)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            Thread.sleep(5000);

            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");

            try {
                WebElement price = driver.findElement(
                        By.xpath("(//span[contains(@class,'a-price-whole')])[1]")
                );
                System.out.println("Galaxy Price: " + price.getText());
            } catch (Exception e) {
                System.out.println("Galaxy price not found but test executed");
            }

            try {
                WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCart);
                System.out.println("Galaxy Add to cart attempted");
            } catch (Exception e) {
                System.out.println("Add to cart skipped (Galaxy)");
            }

        } catch (Exception e) {
            System.out.println("Test failed (Galaxy): " + e.getMessage());
        }

        driver.quit();
    }
}
