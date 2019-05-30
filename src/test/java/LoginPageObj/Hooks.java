package LoginPageObj;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import gherkin.formatter.model.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static LoginPageObj.Utils.LongTimeStamp;

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    //   static  String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(Date());

    //Run Before every Method
    @Before

    public void setUpBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get("http://demo.nopcommerce.com/");
    }
    //Run After every Method
    @After

    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
               scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
                FileUtils.copyFile(ts, new File("Screenshots\\" + scenario.getName() + LongTimeStamp() + ".png"));

                System.out.println("Screenshot taken");

            } catch (Exception e) {

            }
            driver.quit();
        }
        driver.quit();
    }
}
