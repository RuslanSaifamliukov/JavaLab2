package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Проверьте, удовлетворяет ли введённое пользователем число критериям: число делится на 4, и при этом оно не меньше 10.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        if (n % 4 == 0 && n >= 10) {
            System.out.println("ОК! " + n + " удовлетворяет критериям");
        } else {
            System.out.println("НеОК! " + n + " не удовлетворяет критериям");
        }
        in.close();
    }
}
