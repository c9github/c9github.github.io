package AStudy;

import java.util.Scanner;
//190722 ����
//���ڿ� �ݺ� ����
public class BJ_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���ڿ� S �Է�
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int count = sc.nextInt();
			String str = sc.nextLine();
			//���ڸ� R�� �ݺ� �� �� ���ڿ� P �����
			String result = "";
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < count; k++)
					result += str.charAt(j);//result = result + str.charAt(j)�� ���ΰ�
			}
			result = result.replaceAll(" ", "");//replaceAll : ù��° ���ڰ��� ��ȯ�ϰ��� �ϴ� ���
												//�� ��° ���ڰ��� ��ȯ�� ���� ��
			
			//���
			System.out.println(result);
		}

	}

}
