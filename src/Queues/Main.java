package Queues;

public class Main {
    public static void main(String[] args) {
        FilaEstatica fila = new FilaEstatica();

        System.out.println("Fila está vazia? " + fila.isEmpty());

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Fila está cheia? " + fila.isFull());

        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Elemento removido: " + fila.dequeue());

        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}
