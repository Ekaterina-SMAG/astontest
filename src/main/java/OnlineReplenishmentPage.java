import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class OnlineReplenishmentPage {
    private WebDriver driver;

    // Конструктор
    public OnlineReplenishmentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Элементы страницы
    private By blockTitle = By.xpath("//h3[text()='Онлайн пополнение без комиссии']");
    private By paymentOptions = By.cssSelector(".payment-option"); // Замените на актуальный селектор
    private By continueButton = By.id("continue-button"); // Замените на актуальный селектор
    private By phoneInput = By.id("phone-number-input"); // Замените на актуальный селектор
    private By serviceTypeSelector = By.id("service-type-selector"); // Замените на актуальный селектор
    private By successMessage = By.id("success-message"); // Замените на актуальный селектор

    // Метод для получения заголовка блока
    public String getBlockTitle() {
        return driver.findElement(blockTitle).getText();
    }

    // Метод для выбора типа услуги
    public void selectServiceType(String serviceType) {
        driver.findElement(serviceTypeSelector).sendKeys(serviceType);
    }

    // Метод для ввода номера телефона
    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneInput).sendKeys(phoneNumber);
    }

    // Метод для нажатия кнопки «Продолжить»
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    // Метод для получения всех элементов подблоков
    public List<WebElement> getPaymentOptions() {
        return driver.findElements(paymentOptions);
    }

    // Метод для получения сообщения об успешном переходе
    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    // Метод для получения надписей в незаполненных полях
    public List<WebElement> getPlaceholderTexts() {
        // Пример, получите селекторы для пустых полей ввода карты
        return driver.findElements(By.cssSelector(".placeholder-text")); // Замените на актуальный селектор
    }
}
