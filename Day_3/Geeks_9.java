//WAP to count number of pairs in 1-n with sum even.

import java.util.*;

public class Geeks_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    count++;
                    //System.out.println(i +" "+ j);
                }
            }

        }
        System.out.println(count);
    }   
}
