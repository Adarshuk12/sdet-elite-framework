package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    //@Test
    public void numberTypeTest(){
        boolean r=isEven(4);
        Assert.assertEquals(r,true,"The given number is not even");
    }
    @Test
    public void testType(){
        SoftAssert softAssert=new SoftAssert();
        int number=2;
        softAssert.assertTrue(isEven(number),"This is not a even number");
        softAssert.assertTrue(number>0,"This is not greater than 0");
        softAssert.assertAll();

    }

}
