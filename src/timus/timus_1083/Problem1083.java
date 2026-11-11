package timus.timus_1083;

import java.util.Scanner;

public class Problem1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.next().length();
        long result = 1;
        for (int i = n; i > 0; i -= k) {
            result *= i;
        }
        System.out.println(result);
        in.close();
    }
}
