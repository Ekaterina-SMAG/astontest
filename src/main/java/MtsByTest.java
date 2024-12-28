
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

public class MtsByTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("web driver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testOnlineReplenishmentBlock() {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement blockTitle = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        assertNotNull(blockTitle, "Блок 'Онлайн пополнение без комиссии' не найден.");


        List<WebElement> paymentLogos = driver.findElements(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(1) > img"));
        assertFalse(paymentLogos.isEmpty(), "Логотипы платёжных систем не найдены.");


        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a")));
        element.click();


        try {
            WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cookie__close-button")));

            closeButton.click();
        } catch (NoSuchElementException e) {

            System.out.println("Уведомление о куки не найдено.");
        }

        WebElement moreInfoLink = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));
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

