package lr2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Проверьте, делится ли введённое пользователем число на 3.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        if (n % 3 == 0) {
            System.out.println("ОК! " + n + " делится на 3");
        } else {
            System.out.println("НеОК! " + n + " не делится на 3");
        }
        in.close();
    }
}