class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();  // 결과를 저장할 StringBuilder 객체 생성
        int i = a.length() - 1, j = b.length() - 1, carry = 0;  // i, j는 각 문자열의 마지막 인덱스, carry는 올림수를 저장

        while (i >= 0 || j >= 0) {  // 두 문자열의 자릿수가 모두 처리될 때까지 반복
            int sum = carry;  // sum에 올림수를 먼저 더함
            if (j >= 0) sum += b.charAt(j--) - '0';  // b의 j번째 자릿수를 sum에 더함
            if (i >= 0) sum += a.charAt(i--) - '0';  // a의 i번째 자릿수를 sum에 더함
            sb.append(sum % 2);  // sum를 2로 나눈 나머지를 결과에 추가 (0 또는 1)
            carry = sum / 2;  // sum을 2로 나눈 몫을 다음 자릿수의 올림수로 설정
        }
        if (carry != 0) sb.append(carry);  // 마지막으로 남은 올림수가 있다면 결과에 추가
        return sb.reverse().toString();  // 결과를 뒤집어서 반환
    }
}
