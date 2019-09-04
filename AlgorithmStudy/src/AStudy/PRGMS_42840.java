import java.util.*;

//190904 모의고사[JAVA]
//https://programmers.co.kr/learn/courses/30/lessons/42840
class Solution {
    public int[] solution(int[] answers) {
    //수포자의 찍기패턴 = student1 = 5 student2 - 8 student 3=10
        int[] student1 ={1,2,3,4,5};
      int[] student2 = {2,1,2,3,2,4,2,5};
      int[] student3 = {3,3,1,1,2,2,4,4,5,5};

      int []count = new int[3];//3명의 학생이므로 정답을 체크하기 위한 배열 count 생성

      for(int i = 0; i<answers.length; i++){
          if(answers[i]==student1[i%5]){
              count[0]++;
          }
          if(answers[i]==student2[i%8]){
              count[1]++;
          }
          if(answers[i]==student3[i%10]){
              count[2]++;
          }
      }
      //1번 학생을 winner로 놓고 비교하여 가장 높은 점수 확인
      int winner = count[0];
      for(int i = 0; < count.length; i++){
          if(winner < count[i]){
              winner=count[i];
          }
      }

      List<Integer> win = new ArrayList<>();//가장 높은 점수를 받은 학생 list 생성

      //count 배열과 가장 높은 점수를 비교해서 동일한 경우 win arraylist에 추가
      for(int i = 0; i<count.length; i++){
          if(winner == count[i]){
              win.add(i);
          }
      }

      int[] answer = {};//출력값
      answer = new int[win.size()];//출력값은 win list에 추가된 학생 수와 동일하도록 길이 조정

      //출력할 배열 answer에 list에 있는 학생번호 입력
      for(int i = 0; i<win.size(); i++){
          answer[i]=win.get(i)+1;//index가 0부터 시작하므로 1씩 더해줌
      }
return answer;
    }
}