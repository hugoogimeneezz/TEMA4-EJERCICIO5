import java.util.Scanner;

public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final char[] LETTERS = {'B', 'A', 'B', 'C', 'A', 'C', 'D', 'C', 'C', 'D',};
        int count1 = 0;
        int moda = 0;
        int freq = 0;


        count1 = 0;
        for (int i = 0; i < LETTERS.length; i++) {
            count1 = 0;
            char candidata = LETTERS[i];
            for (int j = 0; j < LETTERS.length; j++) {
                if (LETTERS[j] == candidata) {
                    count1++;
                }
            }
            if (count1 > freq) {
                moda = i;
                freq = count1;
            }
            System.out.println(LETTERS[moda] + "aparece" + freq + "veces");
        }
    }
}
