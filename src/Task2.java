import java.sql.Array;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int intArray[] = new int[]{1,2,3,5,7,7,7,6,6,5,4};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            System.out.println("Введите другое значение переменной d");
        }
    }


}
