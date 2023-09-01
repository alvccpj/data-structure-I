package Filas;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        // Criar uma fila usando LinkedList
        Queue<String> fila = new LinkedList<>();

        // Adicionar elementos à fila
        fila.offer("Elemento 1");
        fila.offer("Elemento 2");
        fila.offer("Elemento 3");

        // Acessar e remover elementos da fila
        String primeiroElemento = fila.poll(); // Remove e retorna o primeiro elemento
        System.out.println("Primeiro elemento: " + primeiroElemento);

        // Verificar o tamanho da fila
        System.out.println("Tamanho da fila: " + fila.size());

        // Acessar o próximo elemento da fila sem removê-lo
        String proximoElemento = fila.peek();
        System.out.println("Próximo elemento: " + proximoElemento);

        // Iterar sobre os elementos da fila
        for (String elemento : fila) {
            System.out.println("Elemento: " + elemento);
        }
    }
}

