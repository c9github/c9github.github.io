package AStudy190724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018_1 {
	public static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new char[N][M];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = input.charAt(j);
			}
		}
		int min = N * M;
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= N - 8; j++) {
				int count = getCount(i, j);
				if (min > count)
					min = count;
			}
		}
		
		System.out.println(min);

	}
	
	public static int getCount(int x, int y){//五社球 持失
		int wCount = 0;
		int bCount = 0;
		
		for (int i = x; i < x + i; i++){
			for(int j = y; j<y+8; j++){
				if((i+j)%2 == 0){
					if(arr[i][j] == 'B')wCount++;
					else bCount++;
				}
			}
		}
		return Math.min(wCount, bCount);
	}

}
