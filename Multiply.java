import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;

class Multiply

{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> isPositive = x -> x%2!=0;
        for(Integer a : num)
        {
            if(isPositive.test(a))
            {
                a *= 5;
            }
            else
            {
                a *= 3;
            }
            System.out.println(a);
        }
    }
}