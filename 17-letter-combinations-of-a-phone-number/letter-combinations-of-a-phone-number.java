import java.util.ArrayList;
import java.util.List;

class Solution {
    // 숫자와 문자의 매핑을 저장하는 배열
    private String[] mapping = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return results;
        }
        backtrack(results, digits, "", 0);
        return results;
    }

    private void backtrack(List<String> results, String digits, String current, int index) {
        if (index == digits.length()) {
            results.add(current);
            return;
        }

        // 현재 숫자에 해당하는 문자열을 가져온다.
        String letters = mapping[digits.charAt(index) - '2'];
        for (int i = 0; i < letters.length(); i++) {
            // 현재 문자를 추가하고 다음 문자로 넘어간다
            backtrack(results, digits, current + letters.charAt(i), index + 1);
        }
    }
}
