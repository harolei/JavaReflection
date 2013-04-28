package lei.yu.reflection;

public class TranditionFactory {
    public static fruit getInstance(String fruitName){
        fruit f = null;
        if("Apple".equals(fruitName)){
            f = new Apple();
        }
        if("Orange".equals(fruitName)){
            f = new Orange();
        }
        return f;
    }
}
