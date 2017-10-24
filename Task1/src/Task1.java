import java.util.Scanner;
import java.lang.String;

public class Task1 {
    public static void main(String[] args) {
        String str2 ="";
        System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка в обратном порядке:");
        System.out.println(reverse);

        String abc[] = str.split(" ");
        System.out.println("Каждое слово с новой строки:");
        for (int i = 0; i < abc.length; i++){
            System.out.println(abc[i]);
            str2 = str2.concat(abc[i]+"*");
        }

        System.out.println("Пробел заменен на *:");
        System.out.println(str2.substring(0, str2.length()-1));

        System.out.println("Предложение в UpperCase:");
        System.out.println(str.toUpperCase());

        System.out.println("5ый - 10ые символы:");
        System.out.println(str.substring(4, 9));
    }
}