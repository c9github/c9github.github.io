package AStudy;

import java.util.Scanner;

public class BJ_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력받은 정수 n
		int one = 0; // 첫번째 자리 수
		int two = 0; // 두번째 자리 수
		int twoTemp = 0; // 두 번째 자리 임시 저장
		int cnt = 0;// 사이클 길이

		one = n / 10;
		two = n % 10;
		
		while(true){
			cnt++;
			twoTemp = two;
			two = (one + two) % 10;//두번째 숫자는 합의 가장 오른쪽 자리 숫자
			one = twoTemp;//첫 번째 숫자는 두번째 숫자
			
			if(n == one*10 + two){
				break;
			}
		}
		
		System.out.println(cnt);

	}

}
