public class Stack {
    public int size;
    private long[] stackArray;
    private int top;

    public Stack(int s) {
        size = s + 1;       //bug to tamper with size
        stackArray = new long[size];
        top = -1;
    }

    public void push(int a) {
        stackArray[++top] = a;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == 0);
    } //introduced bug

    public boolean isFull() {
        return (top == size);
    } //introduced bug

}