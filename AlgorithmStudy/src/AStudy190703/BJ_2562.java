package AStudy190703;

import java.io.IOException;
import java.util.Scanner;

public class BJ_2562 {
	//�ִ밪 ���ϱ�
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);//Scanner ����
		int maxNum = 0;
		int idx = 0;
		for (int i = 0; i<10; i++){
			int num = Integer.parseInt(sc.nextLine());
			if(maxNum < num){
				idx = i;
				maxNum = num;
			}
		}
		
	}

}
