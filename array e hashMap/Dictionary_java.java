package Exercices_while;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dic_aurelio = new HashMap<>();
        dic_aurelio.put("arch-distro" , "manjaro");
        dic_aurelio.put("debian-distro" , "Ubuntu");

        for(Map.Entry<String, String> entry: dic_aurelio.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}