package AStudy;

import java.util.Scanner;

public class BJ_2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 상단 * 출력
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < i + 1; j++)// 이중 for문을 사용하여 *을 출력한다
				System.out.print("*");
			for (int j = 0; j < 2 * (N - i - 1); j++)// 공백출력
				System.out.print(" ");
			for (int j = 0; j < i + 1; j++)//오른쪽 * 출력
				System.out.print("*");

			System.out.println(" ");
		}
		// 하단 * 출력
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N - x; y++)
				System.out.print("*");
			for (int y = 0; y < 2 * x; y++)
				System.out.print(" ");
			for (int y = 0; y < N - x; y++)
				System.out.print("*");
			System.out.println(" ");
		}
	}
}
