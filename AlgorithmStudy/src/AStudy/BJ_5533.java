package AStudy;

import java.io.*;
import java.util.*;

public class BJ_5533 {
	// 190722 유니크

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int grades[][] = new int [N][3];
		for(int i = 0; i<N; i++){
			String str1[] = br.readLine().split(" ");//split : 문자열 구분을 위해 사용
			for(int j = 0; j< 3; j++) grades[i][j] = Integer.parseInt(str1[j]);
		}
		for(int i =0; i<N; i++){
			for(int j = 0; j<3; j++){
				boolean isFound = false;
				for(int k  =0; k<N; k++){
					if(i == k) continue;
					if(grades[i][j] == grades[k][j]){
						grades[k][j] = 0;
						isFound = true;
					}
				}
				if(isFound) grades[i][j] = 0;
				
			}
			bw.write((grades[i][0] + grades[i][1] + grades[i][2]) + "\n");
		}
		bw.close();
	}

}
