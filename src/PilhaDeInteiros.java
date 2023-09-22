import java.util.Stack;

public class PilhaDeInteiros {
    public static void main(String[] args) throws Exception {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Elemento no topo da pilha: " + pilha.peek());


        int elementoDesempilhado = pilha.pop();
        System.out.println("Elemento desempilhado: " + elementoDesempilhado);

        int elementoDesempilhado2 = pilha.pop();
        System.out.println("Elemento desempilhado: " + elementoDesempilhado2);

        int elementoDesempilhado3 = pilha.pop();
        System.out.println("Elemento desempilhado: " + elementoDesempilhado3);

        boolean estaVazia = pilha.empty();
        System.out.println("A pilha está vazia? " + estaVazia);
        

        int tamanho = pilha.size();
        System.out.println("Tamanho da pilha: " + tamanho);

        
    }
}
