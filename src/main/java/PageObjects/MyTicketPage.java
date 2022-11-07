package PageObjects;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTicketPage {
    //Locators
    private final By loc_btnCancel = By.xpath("//input[@value='Cancel']");
    private final By loc_selArriveStation = By.name("FilterArStation");
    private final By loc_txtDepartDate = By.name("FilterDpDate");
    private final By loc_btnApplyFilter = By.xpath("//input[@value='Apply Filter']");


    //Elements

    private WebElement getCancelElement() {
        return Constant.driver.findElement(loc_btnCancel);
    }

    private WebElement getArriveStationElement() {
        return Constant.driver.findElement(loc_selArriveStation);
    }

    private WebElement getDepartDateElement() {
        return Constant.driver.findElement(loc_txtDepartDate);
    }

    private WebElement getApplyFilterElement() {
        return Constant.driver.findElement(loc_btnApplyFilter);
    }

    //Methods

}
