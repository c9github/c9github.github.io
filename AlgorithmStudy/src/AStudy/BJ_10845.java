package AStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_10845 {
//190715
	public static void main(String[] args) {
		int b = 0;
		Queue<Integer> que = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i<count; i++){
			
			String a = sc.next();
			if(a.equals("push")){
				b = sc.nextInt();
				que.add(b);
			}else if (a.equals("front")){
				//equals�޼ҵ� : ��ü���� ������ ���� �� �ְ� ���ִ� �޼ҵ�. 
				//==�����ڴ� ����� �ּҰ� ��, equals�޼ҵ�� ����� ���� ��ü ��
				System.out.println(que.isEmpty()?-1:que.peek());
				//peek �޼ҵ� : front�κ��� ���� ��ȯ (queue�� ����ٸ� null�� ��ȯ)
			}else if(a.equals("back")){
				System.out.println(que.isEmpty()?-1:b);
			}else if(a.equals("size")){
				System.out.println(que.size());
			}else if(a.equals("pop")) {
				System.out.println(que.isEmpty()?-1:que.poll());
				//poll�޼ҵ� : front�κ��� ���� �����ϰ� �� ���� ��ȯ(ť�� ����ٸ� null�� ��ȯ)
			}else if(a.equals("empty")){
				System.out.println(que.isEmpty()?1:0);
			}
		}

	}

}
