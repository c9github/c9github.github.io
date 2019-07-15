package AStudy;

import java.util.Scanner;

public class BJ_10828 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//���� ����
		int n = sc.nextInt(); // ����� ��
		int [] arr = new int [n]; //�۾��ϱ� ���� �迭
		int top = -1; //�迭 ��ġ
		String input; //���
		
		for(int i = 0; i<n; i++){
			input = sc.next();
			
			if(input.equals("push")) // ����x�� ���ÿ� �ִ´�.
			{
				top++;
				arr[top] = sc.nextInt();
			}
			else if(input.equals("pop"))
			{
				if(top == -1){ //���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ��쿡�� -1�� ����Ѵ�.(pop)
					System.out.println(-1);
				}else{
					System.out.println(arr[top]);
					top --;
				}
			}
			else if (input.equals("size"))//������ ����ִ� ������ ������ ����Ѵ�.
			{
				System.out.println(top+1);
			}
			else if(input.equals("empty")) //������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
			{
				if(top == -1){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}
			else if(input.equals("top")) //������ ���� ���� �ִ� ������ ����Ѵ�. ���� ��쿡�� -1�� ����Ѵ�. 
			{
				if(top == -1){
					System.out.println(-1);
				}else{
					System.out.println(arr[top]);
				}
			}
		}

	}

}
