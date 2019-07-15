package AStudy;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class BJ_10773 {

	public static void main(String[] args) {
		//���� ó���� ���� ���� ���߿� ��µ�
		Scanner sc = new Scanner(System.in);
		
		final int K = Integer.parseInt(sc.nextLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i =0; i<K; i++){
			String str = sc.nextLine();
			if(str.equals("0"))
				stack.pop();
			else
				stack.push(Integer.parseInt(str));
		}
		
		int sum = 0;
		Iterator iter = stack.iterator();
		while(iter.hasNext()){
			sum += (int)iter.next();
		}
		System.out.println(sum);
		

	}

}
