package test;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        Enumeration prop_names = props.propertyNames();
        while (prop_names.hasMoreElements()) {
            String prop_name = (String) prop_names.nextElement();
            String property = props.getProperty(prop_name);
            System.out.println("property '" + prop_name + "' is '" + property + "'");
        }
    }
}
