//WAP to input n, loop for n times and input 2 numbers in each iteration, if iteration is even(0th,2nd,4th..) print sum else print multplication.

import java.util.*;

public class Geeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (i % 2 == 0) {
                System.out.println(num1 + num2);

            }else {
                System.out.println(num1 * num2);
            }

        }

    }
}
