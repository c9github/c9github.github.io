package AStudy;

import java.util.*;

public class BJ_10871 {
	static int n, x, a;

	public static void main(String[] args) /*throws Exception*/ {
		Scanner sc = new Scanner(System.in);
		//ù° �ٿ� n�� x�� �־�����.
		n = sc.nextInt();
		x = sc.nextInt();

		for (int i = 0; i < n; i++) {//
			a = sc.nextInt();
			if (a < x) {//A���� X���� ���� ���� ���
				System.out.print(a + " ");
			}
		}
	}

}
