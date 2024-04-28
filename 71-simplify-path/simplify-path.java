class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        String[] components = path.split("/");
        
        for (String directory : components) {
            if (directory.equals(".") || directory.isEmpty()) continue;
            if (directory.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(directory);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.insert(0, "/" + dir);
        }
        
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
