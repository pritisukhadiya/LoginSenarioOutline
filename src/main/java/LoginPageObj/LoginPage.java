package LoginPageObj;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

    LoadProp loadProp = new LoadProp();
    // find locator for userName,password,LogInButton
    private By _userName = By.xpath(" //input[@id='Email']");
    private By _password = By.xpath(" //input[@id='Password']");
    private By _LogInButton = By.xpath("//input[@class='button-1 login-button']");


//method enter username,password and click the Login Button

    public void userFilledUserNamePasswordAndClickLoginButton(String Email,String Password){

        enterText(_userName,Email );
        enterText(_password,Password);
        clickElementBy(_LogInButton);
    }

}
