package bj.aripfizer;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        cap.setCapability(MobileCapabilityType.UDID, "06504371BG101509");

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "06504371BG101509");

        cap.setCapability("appPackage", "com.whatsapp");
        cap.setCapability("appActivity", "com.whatsapp.HomeActivity");

//        cap.setCapability("appPackage", "bj.sbin.mobilemoney.customer");
//        cap.setCapability("appActivity", "com.huawei.basicui.splash.GuideActivity");

        driver = new AndroidDriver<>( new URL("http://127.0.0.1:4723"), cap);

        return driver;
    }
}