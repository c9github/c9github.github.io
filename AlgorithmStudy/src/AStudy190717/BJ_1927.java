package AStudy190717;

import java.util.PriorityQueue;
import java.util.*;

public class BJ_1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�켱���� ť ���(���� ������ ������� �켱������ ���� �����Ͱ� ���� ����� �ȴ�)
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();//integer�� ���� �ּҰ����� Ƣ���
		int n = sc.nextInt();
		while(n-- > 0){//���� ���� ��(�̰� ���Ǿƴ�?)
			int x = sc.nextInt();
			if(x==0){
				if(q.isEmpty())//��������� 0 ���
					System.out.println(0);
				else//
					System.out.println(q.poll());//queue�� �ִ� �� �տ� �ִ� �����͸� �̴´�
			}
			else
				q.offer(x);//������ ���� ����
		}
	}

}
