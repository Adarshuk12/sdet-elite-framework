package base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    @AfterMethod
    public void tearDown(){
        System.out.println("This is from tearDown");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("This is from setup");
    }
}
 