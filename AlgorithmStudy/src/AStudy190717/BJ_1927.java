package AStudy190717;

import java.util.PriorityQueue;
import java.util.*;

public class BJ_1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//우선순위 큐 사용(들어온 순서에 상관없이 우선순위가 높은 데이터가 먼저 출력이 된다)
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();//integer를 쓰면 최소값부터 튀어나옴
		int n = sc.nextInt();
		while(n-- > 0){//가장 작은 수(이게 조건아님?)
			int x = sc.nextInt();
			if(x==0){
				if(q.isEmpty())//비어있으면 0 출력
					System.out.println(0);
				else//
					System.out.println(q.poll());//queue에 있는 맨 앞에 있는 데이터를 뽑는다
			}
			else
				q.offer(x);//데이터 순차 보관
		}
	}

}
