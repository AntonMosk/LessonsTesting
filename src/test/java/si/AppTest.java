package si;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test

    public void ourSeleniumTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.itbox.ua/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".svg.svg-libra")).click();
        driver.findElement(By.cssSelector(".input.input-search")).sendKeys("диск");
//        driver.findElement(By.className(".input.input-search")).sendKeys("диск");
        driver.findElement(By.cssSelector(".search-submit")).click();

        driver.findElement(By.cssSelector(".svg.svg-cart")).click();
    }
}
