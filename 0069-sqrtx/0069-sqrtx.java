class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long start = 1;
        long end = x / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long squared = mid * mid;
            
            if (squared == x) {
                return (int)mid;
            } else if (squared < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return (int)end;
    }
}
