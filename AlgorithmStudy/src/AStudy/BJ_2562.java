package AStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//190722 읽음
//백준 2572 최대값 문제
public class BJ_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int maxNumber = 0;
		int maxIdx = 0;
		for (int i = 1; i < 10; i++) {
			int number = Integer.parseInt(br.readLine());
			// readline :BufferedReader 메소드중 하나, 한줄을 읽는다
			if (maxNumber < number) {
				maxIdx = i;
				maxNumber = number;
			}
		}

		bw.write(maxNumber + "\n");
		bw.write(String.valueOf(maxIdx));
		// valueOf : 입력받은 인자 값을 지정된 Number 객체형으로 변환하여 반환
		bw.close();

	}

}
