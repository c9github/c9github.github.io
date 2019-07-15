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

		Set<String> set = new HashSet<>();//회사에 있는 사람을 저장하기 위한 set

		for (int i = 0; i < n; i++) {
			human1 = sc.next();
			human2 = sc.next();
			if (human2.equals("enter"))// set에 추가해줌
				set.add(human1);
			else// leave값이면 set에서 제거
				set.remove(human1);
		}
		// 출력 및 정렬 (hashset은 순서를 신경쓰지 않으므로)
		String[] arr = set.toArray(new String[set.size()]);//set을 배열로 변경해준다.(오름차순으로 정렬하기 위해)
		Arrays.sort(arr);// 오름차순 정렬

		// 내림차순으로 출력
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
