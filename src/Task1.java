import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while(true){
            System.out.println("Введите дробное число через , :");
            Scanner scan = new Scanner(System.in);
            String number = scan.nextLine();
            if (number.matches("[\\d]+,[\\d]+")) {
                System.out.printf("Введенное Вами число : %s\n", number);
                break;
            } else {
                System.out.println("Не корректный ввод! повторите!");
            }
        }
    }
}