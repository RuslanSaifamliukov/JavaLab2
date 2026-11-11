package lr2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Проверьте, попадает ли введённое пользователем число в диапазон от 5 до 10 включительно.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = in.nextInt();
        if (n >= 5 && n <= 10) {
            System.out.println("ОК! " + n + " попадает в диапазон от 5 до 10");
        } else {
            System.out.println("НеОК! " + n + " не попадает в диапазон от 5 до 10");
        }
        in.close();
    }
}