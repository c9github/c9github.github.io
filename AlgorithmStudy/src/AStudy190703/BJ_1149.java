package AStudy190703;

import java.util.Scanner;

public class BJ_1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, n = sc.nextInt();
		int d[][] = new int[n+1][3]; int c[][] = new int[n+1][3];
		for(a=1; a<=n; a++)
			for(b=0; b<3; b++)
				c[a][b] = sc.nextInt();
	}

}
