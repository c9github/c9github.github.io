package AStudy;

import java.util.Scanner;

//공백없이 쓰여진 n개의 숫자를 합하여 출력
public class BJ_11720 {
	// 풀이
	// Scanner 클래스의 메소드로는 숫자를 1자리씩 끊어서 입력받을 수 없다
	// 붙어있는 숫자는 하나의 숫자로 입력받기 때문에 문자열로 입력받아서 한 글자씩 처리해주어야 한다.
	// 첫번째 줄은 n의 숫자로 받고, 두번째 줄들의 숫자는 하나의 문자열로 받는다
	// 그 후 문자열의 길이 만큼 한 글자씩 숫자로 변경(형변환)하여 더해준다
	// 숫자 변경은 2가지 방식으로 처리할 수 있음
	// ASCII를 활용하거나 Integer를 사용하여 강제 형변환 하는것임
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String inputs = sc.next();// String으로 선언
		sc.close();

		int sum = 0;
		for (int i = 0; i < num; ++i) {
			sum += Integer.parseInt(inputs.substring(i, i + 1));// Iteger를 통해 강제
																// 형변환
			//substring함수는 문자열을 원하는 위치에서 자를 때 사용한다.
		}
		System.out.println(sum);

	}

}
