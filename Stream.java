import java.util.stream.Stream;
import java.util.*;

class Stream{
    public static void main(String[] args){
        String str = "sanya hyi sosi";
        String[] str1 = str.split(" ");
        Stream<Stream> stream = Arrays.stream(str1).filter(s -> s.length() < 5 && s.charAt(0) == 's').forEach(System.out::println);
    }
}
