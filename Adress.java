import java.util.regex.*;
import java.util.*;

class Adress {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(([0-9a-zA-Z]{2}:){5}([0-9a-zA-Z]{2})$)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MAC adress: ");
        String word = scanner.nextLine();
        Matcher m = p.matcher(word);
        if(m.matches()) {
            System.out.format("MAC адрес %s  верный\n", word);
        } else {
            System.out.format("MAC адрес %s  неверный\n", word);
        }
    }
}