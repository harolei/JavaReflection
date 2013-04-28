package lei.yu.reflection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Learn {
    public static void main(String[] arg) throws FileNotFoundException, IOException {
        fruit f = TranditionFactory.getInstance("Apple");
        f.eat();
        f = ReflectionFactory.getInstance("lei.yu.reflection.Orange");
        f.eat();
        Properties pro = init.getPro();
        String className = pro.getProperty("apple");
        f = ReflectionFactory.getInstance(className);
        if(f != null){
            f.eat();
        }
    }
}
