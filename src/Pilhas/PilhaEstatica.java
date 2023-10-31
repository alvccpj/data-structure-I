package Pilhas;

public class PilhaEstatica {
    int[] elements;
    int top;

    public PilhaEstatica () {
        this.elements = new int[10];
        this.top = -1;
    }

    public void push (int value) {
        if (top < elements.length - 1) {
            top++;
            elements[top] = value;
        } else {
            throw new IllegalArgumentException ("The stack is full!");
        }
    }

    public int pop () {
        if (!isEmpty()) {
            int value = elements[top];
            top--;
            return value;
        } else {
            throw new IllegalArgumentException ("The stack is empty!");
        }
    }

    public boolean isEmpty () {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull () {
        if (top == 9) {
            return true;
        } else {
            return false;
        }
    }

    public int peek () {
        if (!isEmpty()) {
            return elements[top];
        } else {
            throw new IllegalArgumentException ("The stack is empty!");
        }
    }
}
