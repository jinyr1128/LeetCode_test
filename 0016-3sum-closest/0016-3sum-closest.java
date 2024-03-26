import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // 배열 정렬
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // 초기값 설정
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                // 현재 합과 타겟과의 차이가 이전에 찾은 가장 가까운 합과 타겟과의 차이보다 작으면 업데이트
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                if (currentSum < target) {
                    left++; // 합을 증가시키기 위해 왼쪽 포인터 이동
                } else if (currentSum > target) {
                    right--; // 합을 감소시키기 위해 오른쪽 포인터 이동
                } else {
                    return target; // 정확히 타겟과 일치하는 경우
                }
            }
        }
        
        return closestSum;
    }
}
