package LoginPageObj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs extends Utils {

    HomePage homePage = new HomePage();

    VerificationPage verificationPage = new VerificationPage();

    LoginPage loginPage = new LoginPage();



    @Given("^user is on Home page$")
    public void userIsOnHomePage(){
        verificationPage.verifyUserIsOnHomePage();
    }

    @When("^user navigate to login Page$")
    public void userNavigateToLoginPage(){

        homePage.navigationToLoginPage();

    }

    @When("^user enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterInvalidand(String Email, String Password){
        loginPage.userFilledUserNamePasswordAndClickLoginButton(Email, Password);

    }

    @Then("^user should not be logged in Successfully and user see \"([^\"]*)\"$")
    public void userShouldNotBeLoggedInSuccessfullyAndUserSee(boolean errorMessage){
        verificationPage.assertErrorMessage(errorMessage);



    }
}
