package thisIsCodingTest.ch05_DFS_BFS;

import java.util.Stack;

public class No_01 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.pop();
        stack.push(1);
        stack.push(4);
        stack.pop();

        while (!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
