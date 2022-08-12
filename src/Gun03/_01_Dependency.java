package Gun03;

/*
interwiew sorusu : testlere öncelik nasıl verirsin ?
priority ve dependency ile veririm.  Nasıl kullanırsın ?
1- priority = 1 gibi sıralı rakamlar vererek
2- dependOnMethods la veririm
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {


    @Test
    void startCar(){

        System.out.println("Car started");

    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){

        System.out.println("Car drive");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"driveCar"})
    void parkCar(){

        System.out.println("Car parked");

    }

    @Test(dependsOnMethods = {"parkCar"} , alwaysRun = true)
    void stopCar(){

        System.out.println("Car Stop");
    }

}
