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
        // Проверка названия блока
        String blockTitle = onlineReplenishmentPage.getBlockTitle();
        assertEquals("Онлайн пополнение без комиссии", blockTitle);

        // Проверка наличия вариантов оплаты услуг
        assertFalse(onlineReplenishmentPage.getPaymentOptions().isEmpty(), "Опции оплаты не найдены.");

        // Проверка надписей в незаполненных полях для каждого типа оплаты
        onlineReplenishmentPage.selectServiceType("Услуги связи");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Услуги связи'.");

        // Проверка для остальных типов (домашний интернет, рассрочка, задолженность)
        onlineReplenishmentPage.selectServiceType("Домашний интернет");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Домашний интернет'.");

        onlineReplenishmentPage.selectServiceType("Рассрочка");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Рассрочка'.");

        onlineReplenishmentPage.selectServiceType("Задолженность");
        assertTrue(onlineReplenishmentPage.getPlaceholderTexts().stream().anyMatch(element -> element.getText().contains("Введите номер")), "Плейсхолдер не найден для 'Задолженность'.");

        // Заполнение полей и проверка работы кнопки «Продолжить»
        onlineReplenishmentPage.selectServiceType("Услуги связи");
        onlineReplenishmentPage.enterPhoneNumber("297777777");
        onlineReplenishmentPage.clickContinue();

        // Проверка отображения суммы и телефона в новом окне
        // Здесь вам нужно будет добавить проверки для подтверждения отображения суммы и телефона.

        assertTrue(onlineReplenishmentPage.isSuccessMessageDisplayed(), "Кнопка 'Продолжить' не работает.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}