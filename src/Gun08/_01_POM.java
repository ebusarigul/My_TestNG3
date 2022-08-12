package Gun08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _01_POM {

    public _01_POM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "button>i[class=\"fa fa-heart\"]")
    List<WebElement> wishList;

    @FindBy(css = "h4>a")
    List<WebElement> urunisim;

    @FindBy(id = "wishlist-total")
    public WebElement wishListButton;

    @FindBy(xpath = "//*[@class=\"text-left\"]/a")
    List <WebElement> result;
}