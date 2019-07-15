package AStudy190703;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_2164 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Scanner sc = new Scanner(System.in);
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> arr = new LinkedList<>();
		
		//숫자넣기
		for(int i = 1; i<n; i++){
		arr.add(i);
		}
	}

}
