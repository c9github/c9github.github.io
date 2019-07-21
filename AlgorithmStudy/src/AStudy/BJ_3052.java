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
			remain[i] = num % 42;//% : num 을 42로 나눈 값의 나머지

		}
		Arrays.sort(remain);//오름차순 정렬
		for (int i = 0; i < 9; i++) {
			if (remain[i] != remain[i + 1]) {//서로 다른 나머지 가 몇 개 있는지 출력
				count++;
			}
		}
		System.out.println(count);//서로 다른 나머지 갯수 출력
	}

}
