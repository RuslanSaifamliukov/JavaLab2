package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Проверьте, удовлетворяет ли введённое пользователем число критериям: при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        if (n % 5 == 2 && n % 7 == 1) {
            System.out.println("ОК! " + n + " удовлетворяет критериям");
        } else {
            System.out.println("НеОК! " + n + " не удовлетворяет критериям");
        }
        in.close();
    }
}