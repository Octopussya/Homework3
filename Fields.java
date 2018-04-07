import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
class ExampleClass
{
    private int a = 1;
    protected int b = 2;
    public int c = 3;
}
class Fields
{
    public static void main(String[] args) 
    {
        Class c = ExampleClass.class;
        Field[] fields = c.getDeclaredFields();
        List<Field> privateFields = new ArrayList<>();
        List<Field> publicFields = new ArrayList<>();
        List<Field> protectedFields = new ArrayList<>();
        for (Field f : fields) {
            if (Modifier.isPrivate(f.getModifiers())) {
                privateFields.add(f);
            }
            if (Modifier.isPublic(f.getModifiers())) {
                publicFields.add(f);
            }
            if (Modifier.isProtected(f.getModifiers())) {
                protectedFields.add(f);
            }
        }
        System.out.format("Private: %d \n",privateFields.size());
        System.out.format("Public: %d \n",publicFields.size());
        System.out.format("Protected: %d \n",protectedFields.size());
    }
}
