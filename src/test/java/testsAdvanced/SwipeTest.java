package testsAdvanced;

import advancedObjects.DragScreen;
import config.ConfigAdvancedPages;
import org.testng.annotations.Test;

public class SwipeTest extends ConfigAdvancedPages {


    @Test
    public void horizontalSwipe(){
        new DragScreen(driver)
                .goToSwipe()
        .gotoSwipeBasic()
        .swipeLeftToRight()
        .swipeRightToLeft();
    }

    @Test
    public void verticalSwipe(){
        new DragScreen(driver)
                .goToSwipe()
            .gotoSwipeVertical()
            .swipeDown()
            .SwipeUp();
    }
}
