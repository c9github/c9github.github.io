package AStudy190710;

import java.util.Scanner;
//����� Ǯ��
public class BJ_2217_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //k = ������ ���� 
	      //w = ������ ����
	      
	      
	      Scanner scan = new Scanner(System.in);   
	      
	      int k = scan.nextInt();
	      
	      int[] kArray = new int[k];//������ ������ ���� �迭 ����
	         
	      for(int i=0; i<k; i++) {
	         int inputK = scan.nextInt();
	         
	         kArray[i] = inputK;
	      }
	      
	      
	      int minKW = kArray[0];//�ּ� �߷��� ���� �迭 ����?
	   
	      for(int i=0; i<kArray.length; i++) {
	         
	         if(minKW > kArray[i]) {
	            minKW = kArray[i];
	         }
	      }
	      
	      int maxKW = 0;//�ִ� �߷��� ���� �迭 ����
	      
	      while(true) {
	         
	         int temp = maxKW;
	         
	         maxKW =  minKW / k ;
	         
	         if(maxKW < minKW) {
	            minKW ++;
	         
	         }else if(maxKW == minKW) {
	            break;
	            
	         }else if(maxKW > minKW) {
	            maxKW = temp;
	            break;
	         }
	         
	      }
	      
	      System.out.println(maxKW);
	      
	      
	   }
}
