//WAP to print all multiples of 7 till n

import java.util.*;

public class Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
}
    }
}