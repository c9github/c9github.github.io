package AStudy190710;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		int[] arr = new int[TC];
		
		for(int i = 0; i<TC; i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int result = arr[arr.length-1];
		int test = 0;
		int sum = 0;
		for(int i = 2; i< arr.length+1; i++){
			test = arr[arr.length-i]*i;
			
			result = test>result?test:result;
		}
		System.out.println(result);
	}

}
