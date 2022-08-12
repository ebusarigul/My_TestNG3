package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    // eger test metotlarına sıralama verilmezse alfabetik sırasına göre calısır.

    @Test(priority = 1)   // annotation lar (notasyonlar)
    void webSitesiniAc(){

        System.out.println("Driver tanımlandı ve web sitesi açıldı");

    }

    @Test(priority = 2)
    void loginTestIsleminiYap(){

        System.out.println("Login test islemleri yapıldı");
        // yeşil tik hatalı assertion yok demektir.

    }

    @Test(priority = 3)
    void driveriKapat(){

        System.out.println("driver kapatıldı ve cıkıldı");

    }


}
