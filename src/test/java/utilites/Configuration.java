package utilites;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    public static String getProperties(String key) throws IOException {
        //specify the needed file
        File credsFile=new File ("src/test/resources/conf/Configuration.properties");
        //read from a file
        FileReader fileReader=new FileReader(credsFile);

        Properties properties=new Properties();
        properties.load(fileReader);

        String value=properties.getProperty(key);
        return  value;
    }
}


