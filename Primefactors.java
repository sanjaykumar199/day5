import java.util.*;

public class Primefactors {

    public static void main(String[] args) {

        int n;
        Utility u = new Utility();

        System.out.print("Enter a Number : ");
        n = u.inputInteger();

        System.out.print("The Prime Factors of " + n + " are : ");

        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            } else
                i++;
        }
        System.out.println(" ");
    }
}