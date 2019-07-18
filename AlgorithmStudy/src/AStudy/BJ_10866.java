package AStudy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
//190718 Deque 10866번 문제
public class BJ_10866 {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i<count; i++){
			String a = sc.next();
			if(a.equals("push_back")) {
				int b = sc.nextInt();
				deque.addLast(b);//b를 reat부분에 추가(addLast)
			}else if(a.equals("push_front")) {
				int b = sc.nextInt();
				deque.addFirst(b);//b를 front부분에 추가(addFrist)
			}else if(a.equals("pop_front")) {
				System.out.println(deque.isEmpty()?-1:deque.pop());//pop:덱의 front값을 제거 후 그 그 값을 반환
			}else if(a.equals("pop_back")){
				System.out.println(deque.isEmpty()?-1:deque.removeLast());//removelast:덱의 rear값을 제거 후 그 값을 반환
			}else if(a.equals("size")) {
				System.out.println(deque.size());
			}else if(a.equals("empty")) {
				System.out.println(deque.isEmpty()?1:0);
			}else if(a.equals("front")){
				System.out.println(deque.isEmpty()?-1:deque.peek());//peek:덱의 front값을 반환
			}else if(a.equals("back")){
				System.out.println(deque.isEmpty()?-1:deque.peekLast());//덱의 rear값을 반환
			}
		}

	}

}
