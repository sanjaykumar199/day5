import java.util.*;

public class Harmonic {

    public static void main(String[] args) {

        double result = 0, num = 0, j;
        int n;
        Utility u = new Utility();

        System.out.print("enter the harmonic you want to find: ");
        n = u.inputInteger();

        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("the value of harmonic no. " + n + " is: " + result);

    }

}