package AStudy;

import java.util.Scanner;

public class BJ_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(loop(a));//'loop'를 출력

	}
	static int loop(int a){//'loop'라는 이름의 메소드!!
		int num = 1;
		for(int i = a; i>=1; i--){
			num *= i;
		}
		return num;
	}

}
