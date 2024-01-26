class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1과 nums2의 마지막 요소에서 시작
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        
        // nums2에 남아있는 요소가 있다면, 이를 nums1에 복사
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}