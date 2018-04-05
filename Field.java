import java.lang.reflect.*;
import java.lang.Class;


class Examp
{
    public int publ = 1;
    private int priv = 2;
    protected int protect = 3;

}
class Field
{
    public static void main(String[] args)
    {
        Class examp = Examp.class;
        Field[] fields = examp.getDeclaredFields();
        for(Field f : fields)
        {
            System.out.println(f);
        }
    }

}

