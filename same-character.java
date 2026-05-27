class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 1; i < answer.length; i++){
            char data = s.charAt(i);
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