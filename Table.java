import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.Class;

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation {
    int value();
}

class Table {
    @Annotation(value = 5)
    public static void Method() {
        Table t = new Table();
        try {
            Class<?> c = t.getClass();
            Method m = c.getMethod("Method");
            Annotation annotation = m.getAnnotation(Annotation.class);
            int array[][] = new int[annotation.value() + 1][annotation.value() + 1];
            for(int i = 1; i <= annotation.value(); i++) {
                for (int j= 1; j <= annotation.value(); j ++) {
                    array[i][j] = i * j;
                    System.out.format("%4d ",array[i][j]);
                }
                System.out.format("\n");
                }
            }
        catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }
    public static void main(String[] args)
    {
        Method();
    }
}