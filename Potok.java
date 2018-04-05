import java.util.stream.Stream;
import java.util.*;

class Potok{
    public static void main(String[] args){
        String str = "smkl so smklm akfmdkf wewem we wewe";
        String[] str1 = str.split(" ");
        Stream<String> stream = Arrays.stream(str1).filter(s -> s.length() < 5 && s.charAt(0) == 's');
        stream.forEach(System.out::println);
    }
}