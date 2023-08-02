package Day7;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderElements {
    public PlaceOrderElements() {
        PageFactory.initElements(ParameterDriver.driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchbox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchbutton;

    @FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]")
    public WebElement addtocart;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement cartbutton;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement checkoutbutton;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continue1;

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    public WebElement continue2;

    @FindBy(xpath = "//input[@id='button-shipping-method']")
    public WebElement continue3;

    @FindBy(xpath = "//input[@value='cod']")
    public WebElement cash;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement terms;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    public WebElement continue4;

    @FindBy(xpath = "//input[@id='button-confirm']")
    public WebElement confirmorder;

    @FindBy(xpath = "(//div[@id='content']//p)[1]")
    public WebElement successmessage;


}
