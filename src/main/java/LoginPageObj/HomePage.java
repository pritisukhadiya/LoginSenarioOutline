package LoginPageObj;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {

    public void navigatePage(String link) {

        clickElementBy(By.linkText(link));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    private By _LoginPageLink =  By.xpath("//a[@class='ico-login']");

    public void navigationToLoginPage(){

        clickElementBy(_LoginPageLink);
    }
}
