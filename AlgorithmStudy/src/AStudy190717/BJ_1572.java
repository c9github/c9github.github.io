package AStudy190717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1572 {

	public static final int MAX = 65535;
	private static int[] tree;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		tree = new int[(MAX+1)*2];
		int[] array = new int[N];
		for(int i = 0; i<K; i++){
			array[i]=Integer.parseInt(br.readLine());
			//update(array[i], 1);
		}
		
	}

}
