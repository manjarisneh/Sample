package testcases;

//UI Testing

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

    @Managed
    WebDriver driver;



    @Test
    public void doLogin()
    {
//        driver.get("http://google.com/");
        open();
        find(By.name("q")).sendKeys("Serenity");
    }
}
