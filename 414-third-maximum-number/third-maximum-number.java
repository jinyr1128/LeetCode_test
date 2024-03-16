class Solution {
    public int thirdMax(int[] nums) {
        // 고유한 값들만 저장하기 위한 집합 생성
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // 최대 힙 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(set);
        
        // 세 번째로 큰 값 찾기
        if (pq.size() < 3) {
            // 세 번째로 큰 값이 없으면 최대값 반환
            return Collections.max(pq);
        } else {
            // 세 번째로 큰 값 반환
            pq.poll(); // 첫 번째로 큰 값 제거
            pq.poll(); // 두 번째로 큰 값 제거
            return pq.poll(); // 세 번째로 큰 값 반환
        }
    }
}
