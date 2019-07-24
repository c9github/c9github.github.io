package AStudy190724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1992_1 {

	static int N;
	static int[][] map;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		for(int i = 0; i<N; i++){
			String str = br.readLine();
			for(int j = 0; j<N; j++){
				map[i][j] = Integer.parseInt(str.charAt(j)+"");
			}
		}
		dfs(0, 0, N);

	}
	public static void dfs(int row, int col, int size){
		if(isPossible(row, col, size)){
			System.out.print(map[row][col]);
		}else{
			System.out.println("(");
			int newSize = size / 2;
			dfs(row, col, newSize);
			dfs(row, col+ newSize, newSize);
			dfs(row + newSize, col, newSize);
			dfs(row+ newSize, col+newSize,newSize);
			System.out.print(")");
		}
	}
	
	public static boolean isPossible(int row, int col, int size){
		int black = 0;
		int white = 0;
		for(int i = row; i<row+size; i++){
			for(int j = col; j<col + size; j++){
				if(map[i][j] == 1)
					black += 1;
				else
					white +=1;
				
				if(black > 0 && white >0)
					return false;
			}
		}
		return true;
	}

}
