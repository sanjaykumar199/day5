package com.flip;

import java.util.Scanner;

public class flipcoin {
    public static void main(String[] args) {
        int head=0;
        int tail=0;
        int count=1;
        double random=0.0;
        System.out.println("Please enter the number : ");
        Scanner n = new Scanner(System.in);
        int flip =n.nextInt();

        while(count <= flip) {
            random = Math.random();
            System.out.println(count + " " + random);
            if (random < 0.5) {
                head++;
                System.out.println(" head ");
            }
            else
            {
                tail++;
                System.out.println(" Tails ");

            }
            count++;

        }
        System.out.println();
        System.out.println("Number of Head :" +head);
        System.out.println(" Number of Tails :" + tail);

        double headpercent = (double)head/flip*100;
        double tailpercent = (double)tail/flip*100;

        System.out.println("Percentage of Head :"head);
        System.out.println("Number of tails :"tail)
    }
}
