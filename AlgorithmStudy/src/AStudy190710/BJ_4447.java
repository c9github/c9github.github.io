package AStudy190710;

import java.util.Scanner;

//'g'의 개수와 'b'의 개수만 세면 돼. 'g'가 더 많으면 좋은 놈. 'b'가 더 많으면 나쁜 놈.
//위대하신 히어로 중의 히어로 'Algorithm Crunching Man' 을 떠올려 봐. 'g'가 2개 있고 'b'는 없지.

public class BJ_4447 {

	public static void main(String[] args) {
		
		
		String str;
		int space = 0;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ') space++;

	}
	space++;
	System.out.println("문자의 개수 : " + space + "개");
}


}
