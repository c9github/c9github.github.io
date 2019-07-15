package AStudy;

import java.util.Scanner;
//백준 1110번 더하기 사이클
public class BJ_1110_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 1;
		int check = num;
		while(true){
			int a = num/10;
			int b = num%10;
			int c = a+b;
			num = b*10 + c%10;
			
			if(num == check)
				break;
			else{
				count++;
			}
		}
		System.out.println(count);

	}

}
