package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    /*

    @BeforeClass  -->  her class çalısıyorken önce burası çalısır
      @BeforeMetod  -->  her metottan(test metodu) önce burası çalısır
        @Test     -->  testlerin calıstıgı metotlar.
        @Test     -->  testlerin calıstıgı metotlar.
      @AfterMetod  -->  her metottan(test metodu) sonra burası çalısır
    @AfterClass   -->  her class çalısıyorken sonra burası çalısır

   */
    @BeforeClass
    void beforeClass() {
        System.out.println("Her class dan önce calısacak : Before Class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Her test metod dan önce calısacak : Before Method");
    }

    @Test
    void test1() {
        System.out.println("test1 calıstı");
    }

    @Test
    void test2() {
        System.out.println("test2 calıstı");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("Her test metod dan sonra calısacak : After Method");
    }

    @AfterClass
    void afterClass() {
        System.out.println("Her class dan sonra calısacak : After Class");
    }

}
