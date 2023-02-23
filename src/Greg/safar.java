package Greg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safar {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();


        driver.get("https://www.google.com");
        Thread.sleep(1000);
        //driver.quit();

    }
}
