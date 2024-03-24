class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0; // 최대 면적을 저장할 변수 초기화
        int left = 0; // 왼쪽 포인터
        int right = height.length - 1; // 오른쪽 포인터
        
        while (left < right) {
            // 현재 포인터에서의 높이 중 더 낮은 것을 선택
            int minHeight = Math.min(height[left], height[right]);
            // 현재 포인터 사이의 거리를 사용하여 면적 계산
            int area = minHeight * (right - left);
            // 최대 면적 갱신
            maxArea = Math.max(maxArea, area);
            
            // 더 낮은 높이의 포인터를 이동시킴
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea; // 계산된 최대 면적 반환
    }
}
