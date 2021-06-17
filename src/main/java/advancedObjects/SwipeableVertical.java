package advancedObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableVertical extends BaseScreenAdvanced{
    public SwipeableVertical(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(id = "com.h6ah4i.android.example.advrecyclerview:id/container")
    List<MobileElement> listVerticalElements;

    public SwipeableVertical swipeDown(){
        MobileElement firstElement = listVerticalElements.get(0);

        Rectangle rectangle = firstElement.getRect();

        int yFrom = rectangle.getY()+20;
        int x = rectangle.getX() + rectangle.getWidth()/2;
        int yTo = rectangle.getY() + rectangle.getHeight()-20;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(x, yFrom))
                .moveTo(PointOption.point(x, yTo))
                .release().perform();

        return this;
    }

    public SwipeableVertical SwipeUp(){
        MobileElement firstElement = listVerticalElements.get(4);

        Rectangle rectangle = firstElement.getRect();

        int yFrom =  rectangle.getY() + rectangle.getHeight()-100;
        int x = rectangle.getX() + rectangle.getWidth()/2;
        int yTo = rectangle.getY()+20;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(x, yFrom))
                .moveTo(PointOption.point(x, yTo))
                .release().perform();
        return this;
    }
}
