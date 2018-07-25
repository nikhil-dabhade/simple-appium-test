package Tests;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FirstTest {

    public static AndroidDriver<MobileElement> driver;

    @BeforeSuite
    public void setupAppium() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        URL url = new URL(URL_STRING);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

    }

    @Test
    public void login() throws InterruptedException{
        // Sleep for 30 mins.
        // If you know the average time of your tests locally you can add buffer of a few mins (5-10 mins)
        Thread.sleep(36000);
    }

}