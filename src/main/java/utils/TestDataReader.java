package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class TestDataReader {
    private static Properties testData = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/config/testdata.properties");
            testData.load(fis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public  static String get(String key){
         return testData.getProperty(key);
    }
}

