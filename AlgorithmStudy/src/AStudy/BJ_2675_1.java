package AStudy;

import java.util.Scanner;
//190722
//2675�� ���ڿ� ��ȯ ����
public class BJ_2675_1 {

	public static void main(String[] args) {
		int[] ch = new int[30];// ���ڿ��� ���� �����ϱ� ���� �迭
		char[] ch2 = new char[30];// ch ����� �ƽ�Ű�ڵ尪�� �ٽ� ���ڷ� �ٲٱ� ���� �迭

		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());//���ڿ��� ���� ����ȯ
		for (int i = 0; i < a; i++) {
			String b = sc.nextLine();
			String[] c = b.split(" ");//split() : Ư�� ���ڿ��� �������� ���ڿ��� ������ �迭 �����Ͽ� ����
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
