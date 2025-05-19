package Config;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public class Configuration {

    private static final Properties PROPERTIES = readProperties();

    private static Properties readProperties() {

        Properties properties = new Properties();
        String configPath = System.getenv("CONFIG_PATH");

        if (Objects.isNull(configPath)) {
            configPath = "C:\\Users\\irenc\\Documents\\Hillel\\src\\Main\\resources\\config.properties";
        }

        //зчитування конфігурацій з пропертіс
        try (FileReader fileReader = new FileReader(configPath)) {
            properties.load(fileReader);
            System.out.println(properties);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return properties;
    }


    public static WebDriver getDriver(){

        HashMap<String, String> options = new HashMap<>();
        options.put("download_directory", PROPERTIES.getProperty("download.directory"));
        options.put("implicitlyWait",PROPERTIES.getProperty("implicitly.wait"));
        return DriverManager.getDriver(PROPERTIES.getProperty("browser"), options );
    }

}
