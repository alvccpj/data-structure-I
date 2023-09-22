package ListasEncadeadas;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Método para inserir um elemento no início da lista
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Método para inserir um elemento no fim da lista
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Método para inserir um elemento em uma localização específica
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            insertAtBeginning(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            int currentPosition = 0;
            while (current != null && currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Método para remover um elemento com valor específico
    public void delete(int data) {
        if (head == null) {
            return; // Lista vazia, nada a fazer
        }

        if (head.data == data) {
            head = head.next; // Se o elemento a ser removido é a cabeça, atualiza a cabeça
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // Remove o nó com o valor especificado
        }
    }

    // Método para imprimir os elementos da lista
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(1);
        list.insertAtEnd(3);
        list.insertAtPosition(2, 1);

        System.out.print("Lista: ");
        list.display(); // Deve imprimir "Lista: 1 2 3"

        list.delete(2);

        System.out.print("Lista após a remoção do elemento 2: ");
        list.display(); // Deve imprimir "Lista: 1 3"
    }
}
