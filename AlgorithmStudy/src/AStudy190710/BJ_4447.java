package AStudy190710;

import java.util.Scanner;

//'g'�� ������ 'b'�� ������ ���� ��. 'g'�� �� ������ ���� ��. 'b'�� �� ������ ���� ��.
//�����Ͻ� ����� ���� ����� 'Algorithm Crunching Man' �� ���÷� ��. 'g'�� 2�� �ְ� 'b'�� ����.

public class BJ_4447 {

	public static void main(String[] args) {
		
		
		String str;
		int space = 0;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ') space++;

	}
	space++;
	System.out.println("������ ���� : " + space + "��");
}


}
