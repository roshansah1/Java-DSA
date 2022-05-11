//WAP to count multiples of 3, multiples of 5 and both 3,5 in range 1-n.

import java.util.*;

public class Mul2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 ) {
                count++;
                //System.out.println(i);

            }
            if (i % 5 == 0 ) {
                count2++;
                //System.out.println(i);

            }

            if (i % 3 == 0 || i % 5 == 0) {
                count3++;
                //System.out.println(i);
            }
            
        }
          System.out.println(count);
          System.out.println(count2);
          System.out.println(count3);
    }
}