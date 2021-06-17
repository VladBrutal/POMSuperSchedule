package screenObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SplashScreen extends BaseScreen{
    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/app_version_res']")
    MobileElement versionTextView;

    public LoginScreen checkIfVersionElementPresent(String version){
        shouldHave(versionTextView,version, 15);
        return new LoginScreen(driver);
    }

    public String versionCheck(){
        String versionText = versionTextView.getText();
        return versionText;
    }




}
