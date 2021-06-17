package advancedObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableBasic extends BaseScreenAdvanced{
    public SwipeableBasic(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(id = "com.h6ah4i.android.example.advrecyclerview:id/container")
    List<MobileElement> listHorizontalElements;

    public SwipeableBasic swipeLeftToRight(){
        MobileElement el = listHorizontalElements.get(0);

        Rectangle rect = el.getRect();

        int xFrom = rect.getX()+20;
        int y = rect.getY()+ rect.getHeight()/2;
        int xTo = rect.getX() + rect.getWidth()-20;

        TouchAction<?> touchAction = new TouchAction<>(driver); // wrapping with touch action for complex action like "long press'
        touchAction.longPress(PointOption.point(xFrom, y)) // long touch on a screen
                .moveTo(PointOption.point(xTo, y))
                .release().perform();
        return this;
    }

    public SwipeableBasic swipeRightToLeft(){
        MobileElement el = listHorizontalElements.get(4);

        Rectangle rect = el.getRect();
        int xFrom = rect.getX() + rect.getWidth()-20;
        int y = rect.getY()+ rect.getHeight()/2;
        int xTo = rect.getX()+20;

        TouchAction<?> touchAction = new TouchAction<>(driver); // wrapping with touch action for complex action like "long press'
        touchAction.longPress(PointOption.point(xFrom, y)) // long touch on a screen
                .moveTo(PointOption.point(xTo, y))
                .release().perform();

        return this;
    }
}
