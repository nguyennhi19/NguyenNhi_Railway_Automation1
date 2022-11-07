package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GeneralPage {
    //Locators
    private final String TitleBookTicket = "Book ticket";
    private final By loc_tabLogin = By.linkText("Login");
    private final By loc_tabLogout = By.linkText("Log out");
    private final By loc_tabBookTicket = By.linkText("Book ticket");
    private final By loc_tabContact = By.linkText("Contact");
    private final By loc_tabRegister = By.linkText("Register");
    private final By loc_tabChangePassword = By.linkText("Change password");
    private final By loc_tabTimeTable = By.linkText("Timetable");
    private final By loc_tabMyTicket = By.linkText("My ticket");
    private final By loc_WelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By loc_errorMessage = By.xpath("//div[@id='content']/p");
    private final By loc_txtTitleBookTicket = By.xpath("//h1[contains(.,'Book ticket')]");


    //Elements
    private WebElement getTabLogin() {
        return Constant.driver.findElement(loc_tabLogin);
    }

    private WebElement getTabLogout() {
        return Constant.driver.findElement(loc_tabLogout);
    }

    private WebElement getTabBookTicket() {
        return Constant.driver.findElement(loc_tabBookTicket);
    }

    private WebElement getTabContact() {
        return Constant.driver.findElement(loc_tabContact);
    }

    private WebElement getTabRegister() {
        return Constant.driver.findElement(loc_tabRegister);
    }

    private WebElement getTabChangePassword() {
        return Constant.driver.findElement(loc_tabChangePassword);
    }

    private WebElement getTabTimetable() {
        return Constant.driver.findElement(loc_tabTimeTable);
    }

    private WebElement getTabMyTicket() {
        return Constant.driver.findElement(loc_tabMyTicket);
    }


    private WebElement getWelcomeMessage() {
        return Constant.driver.findElement(loc_WelcomeMessage);
    }

    private WebElement getErrorMessage() {
        return Constant.driver.findElement(loc_errorMessage);
    }

    //Methods

    public WebElement getBookTicketPage() {
        return Constant.driver.findElement(loc_txtTitleBookTicket);
    }

    public void gotoLoginPage() {
        getTabLogin().click();
    }

    public String getWelcomeMessageText() {
        return getWelcomeMessage().getText();
    }

    public void logout() {
        if (getTabLogout() != null)
            getTabLogout().click();
    }


    public void gotoBookTicketPage() {
        getTabBookTicket().click();
    }

    public void gotoContactPage() {
        getTabContact().click();
    }

    public void gotoRegisterPage() {
        getTabRegister().click();
    }

    public void gotoChangePasswordPage() {
        getTabChangePassword().click();
    }

    public void gotoTimetablePage() {
        getTabTimetable().click();
    }

    public void gotoMyTicketPage() {
        getTabMyTicket().click();
    }

    public String getErrorMsg() {
        return this.getErrorMessage().getText();
    }

    public boolean isAtBookTicketPage() {
        return getBookTicketPage().getText().equals(TitleBookTicket);
    }
}
