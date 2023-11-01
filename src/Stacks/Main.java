package Stacks;

public class Main {
    public static void main(String[] args) {
        PilhaEstatica pilha = new PilhaEstatica(); 

        pilha.push(10); 
        pilha.push(20); 
        pilha.push(30); 

        System.out.println("Elemento no topo da pilha: " + pilha.peek()); 
        int valorDesempilhado = pilha.pop(); 
        System.out.println("Valor desempilhado: " + valorDesempilhado); 

        System.out.println("A pilha está vazia? " + pilha.isEmpty()); 

        pilha.pop(); 
        pilha.pop(); 

        System.out.println("A pilha está vazia? " + pilha.isEmpty()); 

        try {
            pilha.pop();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 
        }
    }
}
