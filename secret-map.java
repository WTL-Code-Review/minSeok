class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace("0"," ").replace("1","#");
            
            //answer[i] 첫단어가 " " 경우 ""로 지워지기 때문에 공백 보완 처리 
            if(answer[i].length() < n) {
                for(int j = 0; j <= n -answer[i].length(); j++) {
                    answer[i] = " " + answer[i];    
                }
            }
        }
        
        return answer;
    }
}