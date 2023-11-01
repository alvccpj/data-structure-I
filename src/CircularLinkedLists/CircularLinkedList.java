package CircularLinkedLists;

public class CircularLinkedList {
    public Node head;

    public void addOrdered(Integer value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            head.next = head; // Faz o próximo do único nó apontar para ele mesmo (criando um loop).
            return;
        }

        // Caso especial: Se o novo valor for menor que o valor da cabeça, insere no início.
        if (value <= head.value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != head && current.next.value < value) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void delete(Integer value) {
        if (head == null) {
            return; // A lista está vazia, não há nada para excluir.
        }

        if (head.value.equals(value)) {
            if (head.next == head) {
                head = null; // Se houver apenas um nó na lista, remova-o.
            } else {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = head.next; // Atualiza a ligação anterior para pular o nó da cabeça.
                head = head.next; // Atualiza a cabeça para o próximo nó.
            }
        } else {
            Node current = head;
            while (current.next != head && !current.next.value.equals(value)) {
                current = current.next;
            }

            if (current.next != head) {
                current.next = current.next.next;
            }
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
}
