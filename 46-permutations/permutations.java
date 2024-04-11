import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(nums, results, new ArrayList<>());
        return results;
    }
    
    private void backtrack(int[] nums, List<List<Integer>> results, List<Integer> current) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }
        
        for (int num : nums) {
            if (current.contains(num)) continue;
            current.add(num);
            backtrack(nums, results, current);
            current.remove(current.size() - 1);
        }
    }
}
