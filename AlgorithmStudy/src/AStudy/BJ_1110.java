package AStudy;

import java.util.Scanner;

public class BJ_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �Է¹��� ���� n
		int one = 0; // ù��° �ڸ� ��
		int two = 0; // �ι�° �ڸ� ��
		int twoTemp = 0; // �� ��° �ڸ� �ӽ� ����
		int cnt = 0;// ����Ŭ ����

		one = n / 10;
		two = n % 10;
		
		while(true){
			cnt++;
			twoTemp = two;
			two = (one + two) % 10;//�ι�° ���ڴ� ���� ���� ������ �ڸ� ����
			one = twoTemp;//ù ��° ���ڴ� �ι�° ����
			
			if(n == one*10 + two){
				break;
			}
		}
		
		System.out.println(cnt);

	}

}
