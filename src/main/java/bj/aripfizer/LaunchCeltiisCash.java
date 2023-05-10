package bj.aripfizer;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class LaunchCeltiisCash extends Driver {
    public static <e> void main() throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities();

        Thread.sleep(10000);
        driver.quit();
    }
}