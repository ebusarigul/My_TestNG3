package Gun08;

import Gun07._03_PlaceOrderElements;
import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Senaryo ;
 * 1- Siteye gidiniz..
 * 2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
 * 3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
 * 4- Daha sonra WishList e tıklatınız
 * 5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */
public class _01_WishList extends GenelWebDriver {
    @Test
    @Parameters("urun")
    void wishList(String text) {

        _01_POM elements = new _01_POM(driver);
        _03_PlaceOrderElements elements1 = new _03_PlaceOrderElements(driver);

        elements1.searchBox.sendKeys(text);
        elements1.searchButton.click();

        int rndm = (int) (Math.random() * elements.urunisim.size());

        String urunname = elements.urunisim.get(rndm).getText();

        elements.wishList.get(rndm).click();
        elements.wishListButton.click();

        boolean bulundu = false;
        for (WebElement e : elements.result) {
            if (e.getText().equals(urunname)) {
                bulundu = true;
                break;
            }
        }
        Assert.assertTrue(bulundu);

    }
}
