package AStudy;

import java.util.Scanner;
//190722
//2675번 문자열 변환 문제
public class BJ_2675_1 {

	public static void main(String[] args) {
		int[] ch = new int[30];// 문자열을 나눠 저장하기 위한 배열
		char[] ch2 = new char[30];// ch 저장된 아스키코드값을 다시 문자로 바꾸기 위한 배열

		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());//문자열로 강제 형변환
		for (int i = 0; i < a; i++) {
			String b = sc.nextLine();
			String[] c = b.split(" ");//split() : 특정 문자열을 기준으로 문자열을 나누어 배열 저장하여 리턴
			cnt = Integer.parseInt(c[0]);
			for (int j = 0; j < c[1].length(); j++) {
				ch[j] = b.charAt(j + 2);
				ch2[j] = (char) ch[j];

				for (int x = 0; x < cnt; x++) {
					System.out.print(ch2[j]);
				}
			}
			System.out.println();
		}

	}

}
