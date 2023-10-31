package Pilhas;

public class PilhaEstatica {
    int[] elements;
    int size;
    int top;

    public PilhaEstatica (int size) {
        this.elements = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push (int value) {
        if (top < size - 1) {
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

    public int peek () {
        if (!isEmpty()) {
            return elements[top];
        } else {
            throw new IllegalArgumentException ("The stack is empty!");
        }
    }
}
