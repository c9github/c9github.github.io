package AStudy;

import java.util.Scanner;

public class BJ_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(loop(a));//'loop'�� ���

	}
	static int loop(int a){//'loop'��� �̸��� �޼ҵ�!!
		int num = 1;
		for(int i = a; i>=1; i--){
			num *= i;
		}
		return num;
	}

}
