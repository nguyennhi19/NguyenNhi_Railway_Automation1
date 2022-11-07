package PageObjects;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookTicketPage {
    //Locator
    private final By loc_selectDate = By.xpath("//select[@name='Date']");
    private final By loc_selectDepartFrom = By.xpath("//select[@name='DepartStation']");
    private final By loc_selectArriverAt = By.xpath("//select[@name='ArriveStation']");
    private final By loc_selectSeatType = By.xpath("//select[@name='SeatType']");
    private final By loc_selectTicketAmount = By.xpath("//select[@name='TicketAmount']");
    private final By loc_btnLBookTicket = By.xpath("//input[@value='Book ticket']");

    //Elements

    private WebElement getSelectDate(){
        return Constant.driver.findElement(loc_selectDate);
    }
    private WebElement getSelectDepartFrom(){
        return Constant.driver.findElement(loc_selectDepartFrom);
    }
    private WebElement getSelectArriverAt(){
        return Constant.driver.findElement(loc_selectArriverAt);
    }

    private WebElement getSelectSeatType(){
        return Constant.driver.findElement(loc_selectSeatType);
    }
    private WebElement getSelectTicketAmount(){
        return Constant.driver.findElement(loc_selectTicketAmount);
    }

    private WebElement getBtnBookTicket(){
        return Constant.driver.findElement(loc_btnLBookTicket);
    }

    //Methods
    public void chooseDate(String date) {
        getSelectDate().click();
        Constant.driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+date+"']")).click();
    }

    public void chooseDepartFrom(String departFrom) {
        getSelectDepartFrom().click();
        Constant.driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+departFrom+"']")).click();
    }

    public void chooseArriveAt(String arriveAt) {
        getSelectArriverAt().click();
        Constant.driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+arriveAt+"']")).click();
    }

    public void chooseSeatType(String seatType) {
        getSelectSeatType().click();
        Constant.driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+seatType+"']")).click();
    }

    public void chooseTicketAmount(String ticketAmount) {
        getSelectTicketAmount().click();
        Constant.driver.findElement(By.xpath("//select[@name='Date']//option[text()='"+ticketAmount+"']")).click();
    }

    public void bookTicket(String date, String departFrom, String arriverAt, String seatType, String ticketAmount){
        chooseDate(date);
        chooseDepartFrom(departFrom);
        chooseArriveAt(arriverAt);
        chooseSeatType(seatType);
        chooseTicketAmount(ticketAmount);
        getBtnBookTicket().click();
    }
}
