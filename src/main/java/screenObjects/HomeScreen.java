package screenObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends BaseScreen{

    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[resource-id='com.example.svetlana.scheduler:id/fab_main']")
    MobileElement fabAdd;

    @AndroidFindBy(xpath = "//*[resource-id='com.example.svetlana.scheduler:id/fab_add_event']")
    MobileElement fabAddEvent;


    public boolean isFabAddPresent(){
        should(fabAdd, 15);
        return true;
    }

    public EditCreateEventScreen initCreateNew(){
        fabAdd.click();
        fabAddEvent.click();
        return  new EditCreateEventScreen(driver);
    }
}
