package AStudy190710;

import java.util.Scanner;
//은경님 풀이
public class BJ_2217_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //k = 로프의 개수 
	      //w = 물건의 무게
	      
	      
	      Scanner scan = new Scanner(System.in);   
	      
	      int k = scan.nextInt();
	      
	      int[] kArray = new int[k];//로프의 개수에 대한 배열 선언
	         
	      for(int i=0; i<k; i++) {
	         int inputK = scan.nextInt();
	         
	         kArray[i] = inputK;
	      }
	      
	      
	      int minKW = kArray[0];//최소 중량에 대한 배열 선언?
	   
	      for(int i=0; i<kArray.length; i++) {
	         
	         if(minKW > kArray[i]) {
	            minKW = kArray[i];
	         }
	      }
	      
	      int maxKW = 0;//최대 중량에 대한 배열 선언
	      
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
