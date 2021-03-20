package lambda.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>(Set.of("Rafał", "Darek", "Franek", "Arek"));
        System.out.println(names);
        Set<String> namen = new HashSet<>(Set.of("Rafał", "Darek", "Franek", "Arek"));
        System.out.println(namen);

        Integer[] numerous = {1,2,8,9,1,8,9};
        Set<Object> numb = new LinkedHashSet<Object>();
        System.out.println(numb);
    }
}
