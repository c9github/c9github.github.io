package AStudy190807;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ_11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int N = Integer.parseInt(input.split(" ")[0]);
		int K = Integer.parseInt(input.split(" ")[1]);

		// 동전 종류 입력 받기
		ArrayList<Integer> coins = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			coins.add(sc.nextInt());
		}

		// 최소 동전 개수 구하기
		int coinNum = 0;

		for (int j = N - 1; j >= 0; j--) {
			int coin = coins.get(j);

			if (K >= coin) {
				int q = K / coin;

				K -= coin * q;
				coinNum += q;

			}
		}

		System.out.println(coinNum);
	}

}
