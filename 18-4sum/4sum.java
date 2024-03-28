import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); // 배열을 먼저 정렬합니다.
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            // 첫 번째 숫자의 중복을 건너뜁니다.
            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                // 두 번째 숫자의 중복을 건너뜁니다.
                if (j > i + 1 && nums[j] == nums[j-1]) continue;

                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right]; // 오버플로우 방지를 위해 long 사용
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        
                        // 세 번째 숫자의 중복을 건너뜁니다.
                        while (left < right && nums[left] == nums[left-1]) left++;
                        // 네 번째 숫자의 중복을 건너뜁니다.
                        while (left < right && nums[right] == nums[right+1]) right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
