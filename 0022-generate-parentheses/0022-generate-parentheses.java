import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String current, int open, int close, int max){
        // 현재 문자열의 길이가 최대 길이의 두 배가 되면 결과에 추가합니다.
        if(current.length() == max * 2){
            result.add(current);
            return;
        }
        
        // 열린 괄호의 수가 최대보다 작으면 열린 괄호를 추가하고 재귀 호출합니다.
        if(open < max)
            backtrack(result, current + "(", open + 1, close, max);
        // 닫힌 괄호의 수가 열린 괄호의 수보다 작으면 닫힌 괄호를 추가하고 재귀 호출합니다.
        if(close < open)
            backtrack(result, current + ")", open, close + 1, max);
    }
}
