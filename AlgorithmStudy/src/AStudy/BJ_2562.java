package AStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//190722 ����
//���� 2572 �ִ밪 ����
public class BJ_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int maxNumber = 0;
		int maxIdx = 0;
		for (int i = 1; i < 10; i++) {
			int number = Integer.parseInt(br.readLine());
			// readline :BufferedReader �޼ҵ��� �ϳ�, ������ �д´�
			if (maxNumber < number) {
				maxIdx = i;
				maxNumber = number;
			}
		}

		bw.write(maxNumber + "\n");
		bw.write(String.valueOf(maxIdx));
		// valueOf : �Է¹��� ���� ���� ������ Number ��ü������ ��ȯ�Ͽ� ��ȯ
		bw.close();

	}

}
