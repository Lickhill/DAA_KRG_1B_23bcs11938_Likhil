package Exp1;

class Stack {
    private int top = -1;
    private int size;
    private int[] stack;

    public Stack(int n) {
        size = n;
        stack = new int[n];
    }

    public void pushElement(int a) {
        if (top == size - 1) {
            System.out.println("Stack is Full");
            return;
        }
        top = top + 1;
        stack[top] = a;
    }

    public void popElement() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        top = top - 1;
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stack[top]);
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
    }

    public void isFull() {
        if (top == size - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is not Full");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack obj = new Stack(10);

        obj.pushElement(10);
        obj.pushElement(3);
        obj.pushElement(32);
        obj.pushElement(73);
        obj.pushElement(27);
        obj.popElement();

        System.out.print("Top element: ");
        obj.peek();
        obj.isEmpty();
        obj.isFull();
        System.out.print("Elements in stack: ");
        obj.display();
    }
}
