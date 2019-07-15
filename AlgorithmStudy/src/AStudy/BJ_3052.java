package AStudy;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int[] remain = new int[10];
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			remain[i] = num % 42;

		}
		Arrays.sort(remain);
		for (int i = 0; i < 9; i++) {
			if (remain[i] != remain[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
