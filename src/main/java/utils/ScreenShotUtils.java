package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShotUtils {
    public static void capture(String testName) {
        try {
            LocalDateTime time = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String timeStamp = time.format(formatter);
            System.out.println("Capturing screenshot for :" + testName+"_"+ timeStamp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
