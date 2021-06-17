package advancedObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DragScreen extends BaseScreenAdvanced{
    public DragScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy (accessibility = "Swipe")
    MobileElement swipe;

    public SwipeScreen goToSwipe(){
        swipe.click();
        return new SwipeScreen(driver);
    }


}
