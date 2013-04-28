package lei.yu.reflection;

import static java.lang.Class.forName;

public class ReflectionFactory {
    public static fruit getInstance(String className){
        fruit f = null;
        try {
            f = (fruit)Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return f;
    }
}
