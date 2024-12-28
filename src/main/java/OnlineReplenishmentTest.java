import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class OnlineReplenishmentTest {
    private WebDriver driver;
    private OnlineReplenishmentPage onlineReplenishmentPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        onlineReplenishmentPage = new OnlineReplenishmentPage(driver);
    }

    @Test
    public void testOnlineReplenishmentFlow() {

        String blockTitle = onlineReplenishmentPage.getBlockTitle();
        assertEquals("Онлайн пополнение без комиссии", blockTitle);


        assertFalse(onlineReplenishmentPage.getPaymentOptions().isEmpty(), "Опции оплаты не найдены.");


        onlineReplenishmentPage.selectServiceType("Услуги связи");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Услуги связи'.");


        onlineReplenishmentPage.selectServiceType("Домашний интернет");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Домашний интернет'.");

        onlineReplenishmentPage.selectServiceType("Рассрочка");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Рассрочка'.");

        onlineReplenishmentPage.selectServiceType("Задолженность");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Задолженность'.");


        onlineReplenishmentPage.selectServiceType("Услуги связи");
        onlineReplenishmentPage.enterPhoneNumber("297777777");
        onlineReplenishmentPage.clickContinue();



        assertTrue(onlineReplenishmentPage.isSuccessMessageDisplayed(), "Кнопка 'Продолжить' не работает.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}