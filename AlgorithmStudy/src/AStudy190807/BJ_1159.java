package AStudy190807;

import java.util.Scanner;

public class BJ_1159 {
	// 성의 첫 글자가 같은 선수가 5명보다 적다면, 상근이는 내일 있을 친선 경기를 기권하려고 한다.
	// 상근이는 내일 경기를 위해 뽑을 수 있는 성의 첫 글자를 모두 구해보려고 한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// 개행문자 삭제

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
