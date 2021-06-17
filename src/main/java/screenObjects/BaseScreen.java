package screenObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseScreen {
    AppiumDriver<MobileElement> driver;

    public BaseScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void shouldHave (MobileElement element, String text, long timeOut){
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void type(MobileElement element, String text){
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

    public boolean isDisplayedWithException(MobileElement element){
        try {
            return element.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public void should (MobileElement element, long timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element)); // he will wait until element appears
    }
}
