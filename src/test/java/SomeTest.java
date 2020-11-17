import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class SomeTest {


    @Test
    public void test(){

        RemoteWebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setBrowserName("chrome");
        try {
            driver = new RemoteWebDriver( new URL("http://34.91.168.50:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        Configuration.driverManagerEnabled = false;



        System.out.println("Hi there!!!");
        open("https://ru.selenide.org/index.html");
        $(".main-menu-pages a[href='/quick-start.html']")
                .should(visible)
                .click();
        sleep(50000);
        $(new Selectors.WithText("Как написать UI тест за 10 минут"))
        .shouldBe(visible);
    }
}
