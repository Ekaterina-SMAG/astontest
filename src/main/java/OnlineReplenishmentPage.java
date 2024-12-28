import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class OnlineReplenishmentPage {
    private WebDriver driver;


    public OnlineReplenishmentPage(WebDriver driver) {
        this.driver = driver;
    }


    private By blockTitle = By.xpath("//h3[text()='Онлайн пополнение без комиссии']");
    private By paymentOptions = By.cssSelector(".payment-option");
    private By continueButton = By.id("continue-button");
    private By phoneInput = By.id("phone-number-input");
    private By serviceTypeSelector = By.id("service-type-selector");
    private By successMessage = By.id("success-message");


    public String getBlockTitle() {
        return driver.findElement(blockTitle).getText();
    }


    public void selectServiceType(String serviceType) {
        driver.findElement(serviceTypeSelector).sendKeys(serviceType);
    }


    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneInput).sendKeys(phoneNumber);
    }


    public void clickContinue() {
        driver.findElement(continueButton).click();
    }


    public List<WebElement> getPaymentOptions() {
        return driver.findElements(paymentOptions);
    }


    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }


    public List<WebElement> getPlaceholderTexts() {

        return driver.findElements(By.cssSelector(".placeholder-text")); // Замените на актуальный селектор
    }
}
