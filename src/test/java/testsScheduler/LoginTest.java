package testsScheduler;

import config.ConfigBase;
import dto.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenObjects.SplashScreen;

public class LoginTest extends ConfigBase {
    
    @Test
    public void loginTest(){
        boolean isLoggedIn=
                new SplashScreen(driver)
                .checkIfVersionElementPresent("0.0.3")
                .fillEmail("josephbenmoshe@yahoo.com")
                .fillPassword("Josephbenmoshe1$")
                .clickLogin()
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isLoggedIn);
    }
    
    @Test
    public void completeLoginTest(){
        boolean isLoggedIn1 =
                new SplashScreen(driver)
                .checkIfVersionElementPresent("0.0.3")
                .completeLogin(Credentials.builder()
                        .email("josephbenmoshe@yahoo.com")
                        .password("Josephbenmoshe1$")
                        .build())
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isLoggedIn1);
    }

    @Test
    public void loginTestNegative() throws InterruptedException {
       // boolean isNotLoggedIn =
        String error =
        new SplashScreen(driver)
                .checkIfVersionElementPresent("0.0.3")
                .completeLoginNegative(Credentials.builder()
                        .email("josephbenmoshe@yahoo.com")
                        .password("Josephbenmoshe0$")
                        .build())
                .errorMessage();

        Assert.assertEquals(error, "Wrong email or password");
               // .isLoginButtonPresent();
     //   Assert.assertTrue(isNotLoggedIn);
        // driver.switchTo().alert();
    }



    
}
