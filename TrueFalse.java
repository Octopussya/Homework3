import java.util.function.Predicate;
import java.util.function.Consumer;

class TrueFalse
{
    static Predicate<Integer> condition = x -> x%2!=0;
    public static String ifTrue(int a)
    {
        return "Odd";
    }
    public static String ifFalse(int a)
    {
        return "Even";
    }
	public static String ternaryOperator(int a)
	{
            if(condition.test(a))
            {
                return ifTrue(a);
            }
            else
            {
                return ifFalse(a);
            }
    }
    public static void main(String[] args)
    {
        int a = 6;
        //Predicate<Integer> condition = x -> x%2!=0;
        System.out.println(ternaryOperator(a));
    }
}
