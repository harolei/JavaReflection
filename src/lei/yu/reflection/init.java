package lei.yu.reflection;

import java.io.*;
import java.util.Properties;

public class init {
    public static Properties getPro() throws FileNotFoundException, IOException {
        Properties pro = new Properties();
        File f = new File("fruit.properties");
        if (f.exists()) {
            pro.load(new FileInputStream(f));
        } else {
            pro.setProperty("apple", "lei.yu.reflection.Apple");
            pro.setProperty("orange", "lei.yu.reflection.Orange");
            pro.store(new FileOutputStream(f), "FRUIT CLASS");
        }
        return pro;
    }
}
