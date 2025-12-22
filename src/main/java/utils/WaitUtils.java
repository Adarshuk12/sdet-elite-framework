package utils;

public class WaitUtils {

    public static void sleep(int seconds){
        try {
            long milli = seconds * 1000L;
            Thread.sleep(milli);
        }catch (Exception e){
            System.out.println("error while waiting for the element");
        }
    }
}
