package Mentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class soru1_Elements {

    public soru1_Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = " [title*=\" August 03\"]")
    public WebElement august3;

    @FindBy(id = "ctl00_ContentPlaceholder1_Label1")
    public WebElement result;

}
