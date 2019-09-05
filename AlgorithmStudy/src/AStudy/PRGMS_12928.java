import java.util.*;

//190905 프로그래머스 약수의 합
//자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
//https://programmers.co.kr/learn/courses/30/lessons/12928

class Solution {
    public int solution(int n) {
        int answer = 0;
        int [] arr = new int[n+1];

        for (int i =1; i<=n; i++){
            if(n%i == 0 && arr[i] != 0){
                arr[i] = i;
                int b = n/i;
                arr[b] = b;
            }
        }
        for (int i = 0; i<= n; i++){
            answer += arr[i];
        }
        return answer;
    }
  }