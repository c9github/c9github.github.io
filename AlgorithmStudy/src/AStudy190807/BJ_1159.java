package AStudy190807;

import java.util.Scanner;

public class BJ_1159 {
	// ���� ù ���ڰ� ���� ������ 5���� ���ٸ�, ����̴� ���� ���� ģ�� ��⸦ ����Ϸ��� �Ѵ�.
	// ����̴� ���� ��⸦ ���� ���� �� �ִ� ���� ù ���ڸ� ��� ���غ����� �Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// ���๮�� ����

		sc.nextLine();

		String result = "";

		int[] arr = new int[30];

		for (int i = 0; i < N; i++) {
			String temp = sc.nextLine();
			char a = temp.charAt(0);
			arr[a - 97]++;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 5)
				result += (char) (i + 97);//a
		}
		if (result.equals(""))
			System.out.println("PREDAJA");
		else
			System.out.println(result);
		sc.close();
	}

}
