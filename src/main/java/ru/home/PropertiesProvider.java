package ru.home;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesProvider {
    private static final Properties appProperties = new Properties();
    static {
        try {
            appProperties.load(new FileInputStream("src/main/resources/game.properties"));
        } catch (IOException e) {
            System.out.println("Файл чем-то плох..");
        }
    }
    public static Properties getAppProperties() {
        return new Properties(appProperties);
    }
}
