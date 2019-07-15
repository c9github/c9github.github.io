package AStudy;

//1부터 100까지의 합 출력하기
public class JAVASUM_01 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		for (i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
