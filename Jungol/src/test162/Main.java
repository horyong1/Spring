package test162;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = new int[10]; 
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		arr[0] = num1;
		arr[1] = num2;

		for(int i = 0; i<arr.length-2; i++) {
			arr[i+2]=(arr[i]+arr[i+1])%10;
		}
		
		for(int ar : arr) {
			System.out.print(ar + " ");
			
		}
	}

}
