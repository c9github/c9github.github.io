package AStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//190720 2750�� ���� (�� �����ϱ�)
public class BJ_2750 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();//Arraylist�� �Է°� ����
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 0; i<count; i++){
			int a = sc.nextInt();
			list.add(a);
		}
		Collections.sort(list);//sort�� ����� ����
		for(int i : list){
			System.out.println(i);//���
		}
		
		
		

	}

}
