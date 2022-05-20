package Day_12;

//WAP to print alternate elements in reverse

import java.util.*;

class Day12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		
		for(int i = n-1; i >= 0; i = i-2) {
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i = n-2; i >= 0; i = i-2) {
		    System.out.print(arr[i]+" ");
		}
	}
}