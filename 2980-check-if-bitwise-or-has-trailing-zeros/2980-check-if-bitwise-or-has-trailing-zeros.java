public class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 비트 OR 연산을 수행
                int bitOr = nums[i] | nums[j];
                // 비트 OR 연산 결과가 마지막에 '0'이 있으면 true 반환
                if ((bitOr & 1) == 0) {
                    return true;
                }
            }
        }
        // 모든 쌍을 확인한 후에도 마지막에 '0'이 있는 결과를 찾을 수 없으면 false 반환
        return false;
    }
}
