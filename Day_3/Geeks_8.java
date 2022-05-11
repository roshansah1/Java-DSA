//WAP to find number of pairs with given sum

import java.util.*;

public class Geeks_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = sc.nextInt(); // target
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (i + j == sum) {
                    count++;
                    //System.out.println(i +" "+ j);
                }
            }

        }
        System.out.println(count);
    }   
}
