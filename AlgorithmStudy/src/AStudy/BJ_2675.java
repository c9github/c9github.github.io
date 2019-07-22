package AStudy;

import java.util.Scanner;
//190722 읽음
//문자엷 반복 문제
public class BJ_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열 S 입력
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int count = sc.nextInt();
			String str = sc.nextLine();
			//문자를 R번 반복 후 새 문자열 P 만들기
			String result = "";
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < count; k++)
					result += str.charAt(j);//result = result + str.charAt(j)를 줄인것
			}
			result = result.replaceAll(" ", "");//replaceAll : 첫번째 인자값은 변환하고자 하는 대상
												//두 번째 인자값은 변환할 문자 값
			
			//출력
			System.out.println(result);
		}

	}

}
