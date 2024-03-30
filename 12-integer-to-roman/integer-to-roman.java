class Solution {
    public String intToRoman(int num) {
        // 로마 숫자 변환을 위한 값과 심볼 배열을 정의합니다.
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // 변환된 로마 숫자를 저장할 StringBuilder 객체를 생성합니다.
        StringBuilder roman = new StringBuilder();
        
        // 주어진 숫자를 로마 숫자로 변환합니다.
        for (int i = 0; i < values.length && num > 0; i++) {
            // 현재 값으로 몇 번 나눌 수 있는지 확인합니다.
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        
        // 변환된 로마 숫자를 문자열로 반환합니다.
        return roman.toString();
    }
}
