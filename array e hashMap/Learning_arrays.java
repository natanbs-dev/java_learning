package hash_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Learning_arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Josefina");
        list.add("João");
        list.add("Jonias");

        // Quantidade de pessoas inseridas na lista
        System.out.println(list.size());

        System.out.println("\n===================\n");

        //printando a lista, a partir do FOR:
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("\n===================\n");
        /*list.removeIf(x -> x.charAt(0) == 'J');
        for(String x : list) {
            System.out.println(x);
        }
        */

        System.out.println("\n===================\n");
        System.out.println("Index of Jonias: " + list.indexOf("JONIAS"));
        System.out.println("\n===================\n");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);

    }
        System.out.println("\n===================\n");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
    
}
