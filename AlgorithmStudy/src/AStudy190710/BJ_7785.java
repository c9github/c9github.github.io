package AStudy190710;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BJ_7785 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String human1, human2;

		Set<String> set = new HashSet<>();//ȸ�翡 �ִ� ����� �����ϱ� ���� set

		for (int i = 0; i < n; i++) {
			human1 = sc.next();
			human2 = sc.next();
			if (human2.equals("enter"))// set�� �߰�����
				set.add(human1);
			else// leave���̸� set���� ����
				set.remove(human1);
		}
		// ��� �� ���� (hashset�� ������ �Ű澲�� �����Ƿ�)
		String[] arr = set.toArray(new String[set.size()]);//set�� �迭�� �������ش�.(������������ �����ϱ� ����)
		Arrays.sort(arr);// �������� ����

		// ������������ ���
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
