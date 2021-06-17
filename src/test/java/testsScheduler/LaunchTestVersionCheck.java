package testsScheduler;

import config.ConfigBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenObjects.SplashScreen;

public class LaunchTestVersionCheck extends ConfigBase {

        @Test
        public void VersionTest(){
         String versionActual =
            new SplashScreen(driver)
                    .versionCheck();
            Assert.assertEquals(versionActual, "0.0.3");
        }

        @Test
        public void LaunchTest(){
            String version
                    = new SplashScreen(driver)
                    .versionCheck();
            Assert.assertEquals(version, "0.0.3");
        }

}
