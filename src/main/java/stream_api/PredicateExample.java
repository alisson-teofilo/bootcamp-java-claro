package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aeita um argumento do tipo T e retorna um valor boleano
 * É comumente usada para filtrar os elementos do Sream com base em uma condição
 */
public class PredicateExample {
    public static void main(String[] args) {

        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Sream para filtrar as palavras com mais de 5 caracteres e, em seguida, imprimir cada palavra.
        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

    }
}
