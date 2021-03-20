package lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayMax array = (int[] tab) -> {
            int max = tab[0];
            for (int i = 1; i < tab.length; i++) {
                if (tab[i] > max)
                    max = tab[i];
            }
            return max;
        };
        int[] tab = {9, 5, 7, 8, 6, 1, 2, 3};
        System.out.println(array.getMax(tab));
        Integer[] tablica = new Integer[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tablica[i] = tab[i];
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(tablica));
        System.out.println(list);
        Collections.sort(list);

        List<People> company = new ArrayList<>();
        company.add(new People(751228, 46, "Arek", "Bracki"));
        company.add(new People(850315, 36, "Karolina", "Wicka"));
        company.add(new People(800618, 41, "Radek", "Mirecki"));
        company.add(new People( 900916, 31,"Kuba", "Del"));

       /* for (People el:company) {
            System.out.println(el);
        }*/

        System.out.println();
  Collections.sort(company, new Comparator<People>() {
      @Override
      public int compare(People o1, People o2) {
          return Integer.compare(o1.getAge(), o2.getAge());
      }
  });

        Iterator<People> iter = company.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println();
        Collections.sort(company, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Iterator<People> it = company.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        Collections.sort(company, Collections.reverseOrder(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }));

        Iterator<People> iterat = company.iterator();
        while(iterat.hasNext()){
            System.out.println(iterat.next());
        }
        System.out.println();

        Collections.sort(company, Collections.reverseOrder(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }));
        Iterator<People> iterator = company.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        People people1 = new People(891225, 32, "Jurek", "Bala");
        People people2 = new People(891225, 22, "Zurek", "Zala");
        People people3 = new People(891225, 42, "Kuba", "Ala");
        List<People> friends = new ArrayList<People>(List.of(people1,people2,people3));

        System.out.println(people1.equals(people2));
        friends.addAll(company);
        System.out.println(friends);
        Collections.sort(friends, (o1, o2) -> Integer.compare(o1.getAge(),o2.getAge()));
        System.out.println(friends);

        Collections.sort(friends, (People o1, People o2) ->
                o1.getSurname().compareTo(o2.getSurname()));


      /*People[] friend = friends.toArray(new People[0]);
        for(People el:friend)
      System.out.println(el + " /");*/

        People[] friend = new People[friends.size()];
        friends.toArray(friend);
        System.out.println(Arrays.toString(friend));

        Integer[] tej = {5,9,7,5,7,8,4,5};
        List<Integer> listes = Arrays.asList(tej);
        System.out.println(listes);
    }
}
