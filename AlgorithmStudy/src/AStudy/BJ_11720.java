package AStudy;

import java.util.Scanner;

//������� ������ n���� ���ڸ� ���Ͽ� ���
public class BJ_11720 {
	// Ǯ��
	// Scanner Ŭ������ �޼ҵ�δ� ���ڸ� 1�ڸ��� ��� �Է¹��� �� ����
	// �پ��ִ� ���ڴ� �ϳ��� ���ڷ� �Է¹ޱ� ������ ���ڿ��� �Է¹޾Ƽ� �� ���ھ� ó�����־�� �Ѵ�.
	// ù��° ���� n�� ���ڷ� �ް�, �ι�° �ٵ��� ���ڴ� �ϳ��� ���ڿ��� �޴´�
	// �� �� ���ڿ��� ���� ��ŭ �� ���ھ� ���ڷ� ����(����ȯ)�Ͽ� �����ش�
	// ���� ������ 2���� ������� ó���� �� ����
	// ASCII�� Ȱ���ϰų� Integer�� ����Ͽ� ���� ����ȯ �ϴ°���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String inputs = sc.next();// String���� ����
		sc.close();

		int sum = 0;
		for (int i = 0; i < num; ++i) {
			sum += Integer.parseInt(inputs.substring(i, i + 1));// Iteger�� ���� ����
																// ����ȯ
			//substring�Լ��� ���ڿ��� ���ϴ� ��ġ���� �ڸ� �� ����Ѵ�.
		}
		System.out.println(sum);

	}

}
