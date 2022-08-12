package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_softAssertvsHardAssert {

    @Test
    public void hardAssert() {

        String s1 = "Merhaba";

        System.out.println("Hard Assert Öncesi");

        Assert.assertEquals("Merhaba 123", s1, "Hard Assert Sonucu");

        System.out.println("Hard Assert Sonrası");     //hard Assert hata verdiginde sonrası calısmaz

    }

    @Test
    void softAssert() {

        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String editAccount = "www.facebook.com/editaccountpage";

        SoftAssert _softAssert = new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage);   // true
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage);   // false
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings", editAccount);   // false
        System.out.println("assert 3");

        _softAssert.assertAll();      // bütün assert sonuclarını işleme koyuyor

        System.out.println("Aktiflik sonrası");    // bu bölüm assertAll dan sonra oldugu için ve öncesinde
        // hata oldugu için yazılamadı


    }


}
