package Greg;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.opera.OperaDriver;

public class opera {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.opera.driver", "/Users/oksanademchuk/Downloads/operadriver_mac64");
       // WebDriver driver = new OperaDriver();

        System.out.println("Launching Opera browser...");
        //driver.get("https://duckduckgo.com/");

       // System.out.println("Page title: " + driver.getTitle());

        //driver.quit();
        System.out.println("Browser closed.");
    }
}