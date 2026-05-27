class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            // 두 지도의 값을 합치기.
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 문제 출력 형식에 따른 0 -> " " , 1 -> "#" 으로 변경
            answer[i] = answer[i].replace("0"," ").replace("1","#");
            
            // 9 line - replace 0 -> ' ' 변환 시 첫단어가 ' ' 경우 ''로 처리되어,  
            // 공백 보완 처리 
            if(answer[i].length() < n) {
                for(int j = 0; j <= n -answer[i].length(); j++) {
                    answer[i] = " " + answer[i];    
                }
            }
        }
        
        return answer;
    }
}