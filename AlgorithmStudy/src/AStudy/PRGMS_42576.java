import java.util.*;
//190904 완주하지 못한 선수[JAVA]
//https://programmers.co.kr/learn/courses/30/lessons/42576
class PRGMS_42576 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
   
   int i;
        for( i = 0; i<completion.length; i++){//completion의 길이는 participant의 길이보다 1 작음

            if(!participant[i].equals(completion[i])){
                return participant[i];//paricipant가 completion과 일치하는것이 아니라면 participant[i]를 return 한다.
            }
        }
        return participant[i];
    }
}
        