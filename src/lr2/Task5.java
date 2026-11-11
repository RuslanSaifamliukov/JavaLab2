package lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Определите, сколько тысяч во введённом пользователем числе (четвёртая цифра справа в десятичном представлении числа).");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Math.abs(in.nextInt());
        System.out.println(n / 1000 % 10);
        in.close();
    }
}