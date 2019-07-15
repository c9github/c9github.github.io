package AStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[]input = new String[n];
		
		//�Է�
		int i;
		for(i=0; i<n; i++){
			input[i] = br.readLine();
		}
		
		//���̷� ����
		Arrays.sort(input, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2){
				return Integer.compare(o1.length(), o2.length());
			}
			
		});
		
		//���� ���̳����� ���ĺ� ������ ����
		int j, len, len_temp;
		for(i=0; i<n; i++){
			len = input[i].length();
			for(j=i+1; j<n; j++){
				len_temp = input[j].length();
				if(len != len_temp) break;
			}
			Arrays.sort(input,i,j);
			i=j-1;
		}
		
		//���
		System.out.println(input[0]);
		for(i=1; i<n; i++){
			//���� ���ĺ��̸� ������� �ʰ� �������� �Ѿ
			if(input[i-1].equals(input[i])) continue;
			System.out.println(input[i]);
		}
		
		
	}

}

	//but, i, wont, hesitate, no, more, no, more, it, cannnot, wait, im, yours