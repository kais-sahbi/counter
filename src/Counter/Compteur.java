package Counter;

import java.util.Scanner;

/*Le problème consiste apparemment à compter
        le nombre de fois que le caractère '+' apparaît moins le nombre de fois que le caractère '-' apparaît dans une chaîne de caractères donnée.*/
public class Compteur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                count += 1;
            } else if (s.charAt(i) == '-') {
                count -= 1;
            }
        }
        System.out.println(count);
    }
}
