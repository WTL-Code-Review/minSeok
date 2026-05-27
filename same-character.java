class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 1; i < answer.length; i++){
            char data = s.charAt(i);
            // data 변수 기준으로 왼쪽부터 가장 가까운 같은 글자 찾기 위한 반복문
            for(int j = i-1; j >= 0; j--){
                char chk = s.charAt(j);
                if(chk == data){
                    answer[i] = i-j;
                    break;
                }
                if(j == 0){
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}