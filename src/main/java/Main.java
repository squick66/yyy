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
            System.out.println(tab[i]);
        }
    }
}
