package AStudy;

import java.util.Scanner;

public class BJ_4673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		String line = sc.next();
		for(int i = 0; i<num; i++){
			sum+= line.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
