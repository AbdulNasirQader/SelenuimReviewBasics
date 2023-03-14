package SeleniumReview01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApplication2 {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
      //  driver.get("https://www.google.com/");
        driver.navigate().to("https://google.com/");
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);
    }
}
