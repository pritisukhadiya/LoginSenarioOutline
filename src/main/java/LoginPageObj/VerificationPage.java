package LoginPageObj;

import org.testng.Assert;

public class VerificationPage extends Utils {

    LoadProp loadProp = new LoadProp();

    //verify user is on Home Page
    public void verifyUserIsOnHomePage() {

        String newBaseURL = "http://demo.nopcommerce.com/";

        String currentURL = driver.getCurrentUrl();

        Assert.assertEquals(newBaseURL, currentURL);
    }




    public void assertErrorMessage(boolean errorMsg){

        errorMsg = false;

        boolean errorMsg1 = driver.getPageSource().contains("Login was unsuccessful.");

        boolean errorMsg2 = driver.getPageSource().contains("Please enter your email");

        if (errorMsg1 == true)  {

            errorMsg = true;

        } else if(errorMsg2 == true){

            errorMsg = true;
        }
        else{
            errorMsg = false;
        }
        Assert.assertTrue(errorMsg);
    }

}
