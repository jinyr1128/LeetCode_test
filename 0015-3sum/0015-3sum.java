import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // 배열 정렬
        List<List<Integer>> result = new LinkedList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            // 중복된 값 건너뛰기
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low+1]) low++; // 중복 값 건너뛰기
                        while (low < high && nums[high] == nums[high-1]) high--; // 중복 값 건너뛰기
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        
        return result;
    }
}
