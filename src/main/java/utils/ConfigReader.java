package utils;
import java.io.FileInputStream;
import  java.util.*;

public  class ConfigReader {

    private static Properties config = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/config/config.properties");
            config.load(fis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static  String get(String key){
        return config.getProperty(key);
    }
}