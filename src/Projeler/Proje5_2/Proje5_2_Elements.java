package Projeler.Proje5_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import java.util.List;

public class Proje5_2_Elements {
    public Proje5_2_Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".header_user_info>a")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

    @FindBy(css = "[id=\"center_column\"]>p")
    public WebElement loginText;

    @FindBy(linkText = "Contact us")
    public WebElement contactUs;

    @FindBy(id = "id_contact")
    public WebElement birim;

    @FindBy(name = "id_order")
    public WebElement siparisNo;

    @FindBy(name = "id_product")
    public WebElement urun;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(id = "submitMessage")
    public WebElement submitMessage;

    @FindBy(css = "[class=\"alert alert-success\"]")
    public WebElement succesMessage;

    @FindBy(css = "#header_logo>a")
    public WebElement homePage;

    @FindBy(xpath = "(//*[@class=\"product-container\"])[6]")
    public WebElement favUrun;

    @FindBy(xpath = "(//*[@title=\"Add to cart\"]/span)[6]")
    public WebElement addCart;

    @FindBy(css = "[title=\"Proceed to checkout\"]>span")
    public WebElement proceed;

    @FindBy(xpath = "(//*[@title=\"Proceed to checkout\"]/span)[2]")
    public WebElement proceed2;

    @FindBy(name = "processAddress")
    public WebElement proceed3;

    @FindBy(id = "cgv")
    public WebElement cgv;

    @FindBy(name = "processCarrier")
    public WebElement proceed4;

    @FindBy(css = "[title=\"Pay by bank wire\"]")
    public WebElement bankwire;

    @FindBy(css = "#cart_navigation>button")
    public WebElement confirm;

    @FindBy(css = "[class=\"box\"]")
    public WebElement siparisNumarasi;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
    public WebElement backToOrder;

    @FindBy(css = ".footable-toggle+a")
    public List<WebElement> urunlerListe;

    @FindBy(css = ".logout")
    public WebElement logoutButton;

    @FindBy(css = ".login")
    public WebElement loginButton;
}
