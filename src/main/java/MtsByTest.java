
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

        import java.util.List;

public class MtsByTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("web driver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
    }

    @Test
    public void testOnlineReplenishmentBlock() {

        WebElement blockTitle = driver.findElement(By.xpath("//h3[text()='Онлайн пополнение без комиссии']"));
        assertNotNull(blockTitle, "Блок 'Онлайн пополнение без комиссии' не найден.");


        List<WebElement> paymentLogos = driver.findElements(By.cssSelector("selector-for-payment-logos"));
        assertFalse(paymentLogos.isEmpty(), "Логотипы платёжных систем не найдены.");


        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        moreInfoLink.click();
        assertEquals("https://www.mts.by/online-replenishment-details", driver.getCurrentUrl(), "Ссылка 'Подробнее о сервисе' не работает.");
        driver.navigate().back();

        driver.findElement(By.id("service-type-selector")).sendKeys("Услуги связи");
        driver.findElement(By.id("phone-number-input")).sendKeys("297777777");
        driver.findElement(By.id("continue-button")).click();


        assertTrue(driver.findElement(By.id("success-message")).isDisplayed(), "Кнопка 'Продолжить' не работает.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        assert driver != null;
        driver.quit();
    }
}