package AStudy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
//190718 Deque 10866�� ����
public class BJ_10866 {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i<count; i++){
			String a = sc.next();
			if(a.equals("push_back")) {
				int b = sc.nextInt();
				deque.addLast(b);//b�� reat�κп� �߰�(addLast)
			}else if(a.equals("push_front")) {
				int b = sc.nextInt();
				deque.addFirst(b);//b�� front�κп� �߰�(addFrist)
			}else if(a.equals("pop_front")) {
				System.out.println(deque.isEmpty()?-1:deque.pop());//pop:���� front���� ���� �� �� �� ���� ��ȯ
			}else if(a.equals("pop_back")){
				System.out.println(deque.isEmpty()?-1:deque.removeLast());//removelast:���� rear���� ���� �� �� ���� ��ȯ
			}else if(a.equals("size")) {
				System.out.println(deque.size());
			}else if(a.equals("empty")) {
				System.out.println(deque.isEmpty()?1:0);
			}else if(a.equals("front")){
				System.out.println(deque.isEmpty()?-1:deque.peek());//peek:���� front���� ��ȯ
			}else if(a.equals("back")){
				System.out.println(deque.isEmpty()?-1:deque.peekLast());//���� rear���� ��ȯ
			}
		}

	}

}
