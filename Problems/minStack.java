// min-stack
// https://leetcode.com/problems/min-stack/submissions/

class Node {
    int data;
    Node next;
};
class MinStack {
    int min;
    int previousMin;
    Node top;
    /** initialize your data structure here. */
    public MinStack() {
        this.top = null;
        this.min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(top==null) {
            min = x;
        }
        if(x <= min) {
            Node node = new Node();
            node.data = min;
            node.next = top;
            top = node;
            min = x;
        }

        Node node = new Node();
        node.data = x;
        node.next = top;
        top = node;
    }

    public void pop() {
        Node copy = top;
        top = top.next;
        copy.next = null;

        if(copy.data == min) {
            min = top.data;
            Node copy2 = top;
            top = top.next;
            copy2.next = null;
        }


    }

    public int top() {
        return top.data;
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
