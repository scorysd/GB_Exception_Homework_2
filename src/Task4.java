import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите строку:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if (str.isEmpty()) {
                System.out.println("Недопустимо вводить пустую строку!Повторите!");
            } else {
                System.out.printf("Вы ввели : %s\n", str);
                break;
            }
        }

    }
}
