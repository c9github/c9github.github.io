package AStudy;

//1���� 100������ Ȧ���� / ¦���� ���ϱ�
public class JAVASUM_02 {

	public static void main(String[] args) {
		int even = 0;// �ʱⰪ ����(¦��)
		int odd = 0;// �ʱⰪ ����(Ȧ��)

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {// ¦�� ���ǽ�
				even += i;
			} else {// Ȧ�� ���ǽ� : i%2==1 �Ǵ� i%2!=0;
				odd += i;// odd = odd + i;
			}
		}
		System.out.println("¦�� �� : " + even);
		System.out.println("Ȧ�� ��: " + odd);

	}

}
