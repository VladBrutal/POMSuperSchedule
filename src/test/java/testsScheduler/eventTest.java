package testsScheduler;

import config.ConfigBase;
import dto.Credentials;
import dto.Event;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenObjects.SplashScreen;

public class eventTest extends ConfigBase {

    @Test
    public void eventCreationTest(){
        boolean isEvenAdded =
        new SplashScreen(driver)
                .checkIfVersionElementPresent("0.0.3")
                .completeLogin(Credentials.builder()
                        .email("josephbenmoshe@yahoo.com")
                        .password("Josephbenmoshe1$")
                        .build())
                .skipWizard()
                .initCreateNew()
                .fillCreationForm(Event.builder()
                        .title("New Event")
                        .type("event")
                        .breaks(2)
                        .ammount("50")
                        .build())
                .confirmCreation()
                .isFabAddPresent();
        Assert.assertTrue(isEvenAdded);
    }

    @Test
    public void eventCreationNegativeTest(){
      //  boolean isEvenAdded =
                new SplashScreen(driver)
                        .checkIfVersionElementPresent("0.0.3")
                        .completeLogin(Credentials.builder()
                                .email("josephbenmoshe@yahoo.com")
                                .password("Josephbenmoshe1$")
                                .build())
                        .skipWizard()
                        .initCreateNew()
                        .fillCreationForm(Event.builder()
                                .title("New Event")
                                .type("event")
                                .breaks(2)
                                .ammount("50")
                                .build())
                        .confirmCreation();
                       // .isFabAddPresent();
       // Assert.assertTrue(isEvenAdded);
    }
}
