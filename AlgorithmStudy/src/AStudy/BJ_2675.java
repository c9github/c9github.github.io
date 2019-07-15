package AStudy;

import java.util.Scanner;

public class BJ_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int count = sc.nextInt();
			String str = sc.nextLine();

			String result = "";
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < count; k++)
					result += str.charAt(j);//result = result + str.charAt(j)를 줄인것
			}
			result = result.replaceAll(" ", "");
			System.out.println(result);
		}

	}

}
