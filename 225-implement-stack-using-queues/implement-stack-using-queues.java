import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    // 요소 x를 스택의 맨 위에 넣습니다.
    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    
    // 스택의 맨 위에 있는 요소를 제거하고 그 값을 반환합니다.
    public int pop() {
        return queue1.remove();
    }
    
    // 스택의 맨 위에 있는 요소를 반환합니다.
    public int top() {
        return queue1.peek();
    }
    
    // 스택이 비어있는지 여부를 반환합니다.
    public boolean empty() {
        return queue1.isEmpty();
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */