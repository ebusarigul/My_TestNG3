package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    @Test
    void EqualOrnek(){

        String s1 = "Merhaba ";
        String s2 = "İyi aksamlar";

        // (Olusan, Beklenen , "Hata Baslıgı")
        Assert.assertEquals(s1,s2,"Karsılastırma sonucu");

    }

    @Test
    void NotEqualOrnek(){

        String s1 = "Merhaba ";
        String s2 = "İyi aksamlar";

        // (Olusan, Beklenen , "Hata Baslıgı")
        Assert.assertNotEquals(s1,s2,"Karsılastırma sonucu");

    }

    @Test
    void TrueOrnek(){

        int s1 =55;
        int s2 =55;

        Assert.assertTrue(s1 == s2,"Karsılastırma sonucu");

    }

    @Test
    void nullOrnek(){

        String s1 =null;

        Assert.assertNull(s1,"Karsılastırma sonucu");

    }

    @Test
    void direktFail(){

        int a = 55;

        if (a==55){
            Assert.fail();
        }

    }





}
