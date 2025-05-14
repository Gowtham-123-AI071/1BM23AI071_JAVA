import java.io.OutputStream;

interface Stack1 {
    void push(int data);
    int pop();
    int peek();
    boolean isEmpty();
}
class FixedLengthStack implements Stack1 {
    private int[] arr;
    private int top;
    private int capacity;

    FixedLengthStack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        top += 1;
        arr[top] = data;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int head = arr[top];
        top -= 1;
        return head;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}

public class Stack_Demo{
    public static void main(String[] args) {

        System.out.println("Fixed Length Stack implementation: ");
        Stack1 s = new FixedLengthStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
//Output
//Fixed Length Stack implementation:
//        40
//        30
//        20
//        10
