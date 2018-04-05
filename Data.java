import java.util.regex.*;
import java.util.*;

class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data and template: ");
        String word = scanner.next();
        String template = scanner.next();
        Pattern p = Pattern.compile(template);
        Matcher m = p.matcher(word);
        if(m.matches()) {
            System.out.format("Дата %s соответствует шаблону %s", word, template);
        } else {
            System.out.format("Ошибка. Дата %s не соответствует шаблону %s", word, template);
        }
    }
}