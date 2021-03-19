package lambda;

public class Main {
    public static void main(String[] args) {
        ArrayMax array = (int[] tab) -> {
            int max = tab[0];
            for (int i = 1; i < tab.length; i++) {
                if(tab[i] > max)
                    max = tab[i];
            }
            return max;
        };
        int[] tab = {9,5,7,8,6,1,2,3};
        System.out.println(array.getMax(tab));
    }
}
