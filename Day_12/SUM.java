//WAP to take input of an array and find the sum

package Day_12;

import java.util.*;

class SUM {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
		    sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
