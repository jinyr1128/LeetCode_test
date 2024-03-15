class Solution {
    public String convert(String s, int numRows) {
        // numRows가 1이거나 s의 길이보다 크거나 같은 경우, 변환 없이 s를 반환
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        
        // 각 행을 저장할 StringBuilder 배열 생성
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        // 현재 위치와 방향을 나타내는 변수
        int currentRow = 0;
        boolean goingDown = false;
        
        // 주어진 문자열 s를 순회하면서 각 문자를 올바른 위치에 추가
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            // 최상단 또는 최하단에 도달할 때 마다 방향 전환
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        
        // 모든 행을 순차적으로 연결하여 최종 결과 문자열 생성
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        
        return result.toString();
    }
}
