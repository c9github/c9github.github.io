package AStudy;

import java.util.Scanner;

public class BJ_10951_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {//값이 숫자인지 아닌지 판별한다
			int a = sc.nextInt();//값이 숫자일 경우 이쪽으로 값을 넣어준다.
			int b = sc.nextInt();

			System.out.println(a + b);

		}

	}
}