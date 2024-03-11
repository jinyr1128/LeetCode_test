class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // 이미 나타난 숫자를 발견하면 true 반환
            }
            seen.add(num); // 현재 숫자를 집합에 추가
        }
        return false; // 모든 요소가 고유하므로 false 반환
    }
}
