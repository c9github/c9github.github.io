//190905 프로그래머스 문자열 다루기 기본
//https://programmers.co.kr/learn/courses/30/lessons/12918
class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        // s가 a234이면 false 리턴 1234라면 true 리턴
        if (s.length() == 4 || s.length() == 6) {
            // 제한 사항에 보면 입력값 s는 1이상 길이 8이하인 문자열 이므로, if 를 이용하여 문자열 s의 길이가 4 혹은 6 인 경우를 확인한다.
            try {
                int n = Integer.parseInt(s);
                // Integer를 사용하면 String을 int로 강제 형변환함 근데 문자가 포함된경우 NumberFormatException 에러가 발생함
                // 그러므로 try catch문을 통해 에러 예외처리를 해준다.
                answer = true;
            } catch (NumberFormatException e) {
                answer = false;
            }
        } else
            answer = false;

        return answer;
    }
}