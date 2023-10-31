package Filas;

public class FilaEstatica {
    int[] elements;
    int first;
    int last;
    int total;

    public FilaEstatica() {
        this.elements = new int[10];
        this.first = 0;
        this.last = 0;
        this.total = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia!");
        } else {
            elements[last] = value;
            last = (last + 1) % elements.length;
            total++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        } else {
            int value = elements[first];
            first = (first + 1) % elements.length;
            total--;
            return value;
        }
    }

    public boolean isEmpty() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (total == elements.length) {
            return true;
        } else {
            return false;
        }
    }

}
