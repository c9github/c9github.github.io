package AStudy190710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//πŒ¡ˆ¥‘ «Æ¿Ã
public class BJ_2217_2 {

	public static void main(String[] args) throws IOException{//øπø‹√≥∏Æ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] weight = new int[N];
		for(int i = 0; i < N; i++){
			weight[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(weight);
		
		int maxWeight = 0;
		for(int i = 0; i<N; i++){
			int sum = weight[i] * (N-i);
			if(maxWeight < sum)maxWeight = sum;
		}
		System.out.println(maxWeight);
		
		br.close();
		

	}

}
