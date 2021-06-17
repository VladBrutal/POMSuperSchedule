package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.events.EventFiringWebDriverFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ConfigBase {
    protected AppiumDriver<MobileElement> driver;

    @BeforeMethod    //@BeforeSuite
    public void  setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "com.example.svetlana.scheduler");
        capabilities.setCapability("appActivity", ".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", "/Users/vladmac/Downloads/Software/Android/v.0.0.3.apk");

        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("fullReset", "true");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver = EventFiringWebDriverFactory.getEventFiringWebDriver(driver, new AppiumListener());
    }

    @AfterMethod(alwaysRun = true)     //@AfterSuite
    public void tearDown(){
        driver.resetApp();
        driver.closeApp();

        driver.quit();
    }
}
