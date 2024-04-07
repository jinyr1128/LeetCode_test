class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String previous = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < previous.length(); i++) {

            if (i == previous.length() - 1 || previous.charAt(i) != previous.charAt(i + 1)) {
                result.append(count); 
                result.append(previous.charAt(i)); 
                count = 1; 
            } else {
                count++;
            }
        }
        
        return result.toString();
    }
}
