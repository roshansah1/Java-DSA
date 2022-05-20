package Day_12;

//WAP print alternate elements of array

import java.util.*;

class Day_12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i = i+2) {
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i = 1; i < n; i = i+2) {
		    System.out.print(arr[i]+" ");
		}
	}
}
