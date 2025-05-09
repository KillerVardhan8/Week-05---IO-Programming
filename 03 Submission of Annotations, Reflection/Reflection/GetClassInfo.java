import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }
        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}