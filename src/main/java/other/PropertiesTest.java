package other;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws Exception {

        FileInputStream propFile = new FileInputStream("appProperties");
        Properties applicationProps = new Properties(System.getProperties());
        applicationProps.load(propFile);

        System.setProperties(applicationProps);
        System.getProperties().list(System.out);
    }
}
