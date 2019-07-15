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
				//equals메소드 : 객체끼리 내용을 비교할 수 있게 해주는 메소드. 
				//==연산자는 대상의 주소값 비교, equals메소드는 대상의 내용 자체 비교
				System.out.println(que.isEmpty()?-1:que.peek());
				//peek 메소드 : front부분의 값을 반환 (queue가 비었다면 null값 반환)
			}else if(a.equals("back")){
				System.out.println(que.isEmpty()?-1:b);
			}else if(a.equals("size")){
				System.out.println(que.size());
			}else if(a.equals("pop")) {
				System.out.println(que.isEmpty()?-1:que.poll());
				//poll메소드 : front부분의 값을 제거하고 그 값을 반환(큐가 비었다면 null값 반환)
			}else if(a.equals("empty")){
				System.out.println(que.isEmpty()?1:0);
			}
		}

	}

}
