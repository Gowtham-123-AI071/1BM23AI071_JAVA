import java.util.*;

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

class DynamicLengthStack implements Stack1 {
    private int[] stack;
    private int top;
    private int capacity;
    public DynamicLengthStack(int size) {
        stack = new int[size];
        capacity = size;
        top =-1;
    }
    public void push(int item) {
        if (isFull()) {
            resizeStack();
        }
        stack[++top] = item;

    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return-1;
        }
        return stack[top--];
    }
    public boolean isEmpty() {
        return top ==-1;
    }
    public boolean isFull() {
        return top == capacity- 1;
    }
    private void resizeStack() {
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, capacity);
        capacity *= 2;
        System.out.println("Stach size resized to : "+capacity);
        stack = newStack;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
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

        System.out.println();
        System.out.println("Dynamic Length Stack implementation: ");
        Stack1 s1 = new DynamicLengthStack(5);

        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}

//OUTPUT:

//Fixed Length Stack implementation:
//        40
//        30
//        20
//        10

//Dynamic Length Stack implementation:
//        3
//        2
//        1