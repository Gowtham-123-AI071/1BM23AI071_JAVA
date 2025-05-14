interface Stack<T> {
    void push(T element);
    T pop();
    boolean isEmpty();
    T peek();
}

class DynamicStack<T> implements Stack<T> {
    private Object[] stackArray;
    private int top;
    private int capacity;

    public DynamicStack(int initialCapacity) {
        this.capacity = initialCapacity;
        stackArray = new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T element) {
        if (top == capacity - 1) {
            capacity *= 2;
            Object[] newStackArray = new Object[capacity];
            System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);
            stackArray = newStackArray;
        }
        stackArray[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = (T) stackArray[top];
        stackArray[top--] = null;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) stackArray[top];
    }
}

class ClassA {
    int defaultVar = 10;
    protected int protectedVar = 20;
    private int privateVar = 30;
    public int publicVar = 40;
}

class ClassB extends ClassA {
    public void display() {
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}

public class Stacktest {
    public static void main(String[] args) {
        Stack<Integer> stack = new DynamicStack<>(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        ClassB classB = new ClassB();
        classB.display();
    }
}

//output
//Popped: 30
//Popped: 20
//        10
//        20
//        40
