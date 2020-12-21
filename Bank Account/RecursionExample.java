package bank;

import java.util.Scanner;

public class RecursionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0; int total = 0;
		int[] arr = new int[5];
	    System.out.println("Enter "+ arr.length  + " integer values:");
		for(int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			}
		prime(arr, x, total);
	}
	public static void prime(int[] arr, int x, int total) {
		if(arr.length == x) {
			System.out.println("Sum of all five:"+total);
		}
		else {
			total = total + arr[x];
			x++;
			prime(arr, x, total);
		}
	}

}

