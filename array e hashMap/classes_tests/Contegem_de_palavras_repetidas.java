package hash_map.classes_tests;

import java.util.HashMap;
import java.util.Map;

public class Contegem_de_palavras_repetidas {
    public static void main(String[] args) {
        String sentence = "O gato está no telhado e o cachorro também está no telhado";
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
    }

}
