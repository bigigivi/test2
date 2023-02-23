package Greg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vk {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver","/Users/oksanademchuk/Downloads/chromedriver_mac_arm64");

        WebDriver driver = new ChromeDriver();

        driver.get("http://vk.com");
        Thread.sleep(1000);

        WebElement sighIn = driver.findElement(By.xpath("//*[@id='index_rcolumn']/div[2]/div/div/div[1]/button"));
        sighIn.click();
        Thread.sleep(1000);

        WebElement uncheckBox = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div/div/div/form/div[1]/section/div[2]/div/div/label"));
        uncheckBox.click();
        Thread.sleep(1000);




        WebElement phoneN = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[2]/div/div/div/form/div[1]/section/div[1]/div/div/input"));
        phoneN.sendKeys("+15615623322");
        phoneN.sendKeys(Keys.RETURN);
        Thread.sleep(700);

        WebElement delett = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div/div/div/form/div[1]/section/div[1]/div/div/input"));
        delett.clear();
        Thread.sleep(1000);

        WebElement phoneN1 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div/div/div/form/div[1]/section/div[1]/div/div/input"));
        phoneN1.sendKeys("15615623322");
        phoneN1.sendKeys(Keys.RETURN);
        Thread.sleep(700);


        WebElement cont = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div/div/div/form/div[2]/div[1]/button"));
        cont.click();
        Thread.sleep(1000);




       // driver.quit();
    }
}
