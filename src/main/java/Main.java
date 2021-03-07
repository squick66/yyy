public class Main {
    public static void main(String[] args) {
        int[] tab = {1,5,8,4,6,7};

        for (int index: tab) {
            System.out.print(index + " ");
        }

        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i] + 5);
        }

        int b = 1;
        for (int i = 0; i <tab.length ; i++) {
            tab[i]=tab[i] + b;
            System.out.print(tab[i] + " ");
        }

        Raz raz2 = new Raz("Lupo", 2000);
        System.out.println(raz2.rename());

        Raz raz1 = new Raz("auto1", 2010);
        System.out.println(raz1.firstLetter());
        30a1b6b... Utworzenie metody rename.
    }
}
