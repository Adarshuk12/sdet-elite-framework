package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    @Test
    public void testExample(){
        System.out.println("This is from testExample");
        Assert.assertEquals("This is from testExample","This is from testExample");
    }

}
