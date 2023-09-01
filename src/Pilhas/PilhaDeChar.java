package Pilhas;

import java.util.Stack;

public class PilhaDeChar {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();

        String s = "abbaca";

        //removendo caracteres adjacentes
        for (int i = 0; i < s.length(); i++) {
            if (pilha.empty() == false && pilha.peek() == s.charAt(i)) {
                pilha.pop();
            } else {
                pilha.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (pilha.isEmpty() == false) {
            sb.append(pilha.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
