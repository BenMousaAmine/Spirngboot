package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int n, i;
        int base, height;
        System.out.println("Quanti retangoli voi inserire");
        n = input.nextInt();


        Rect[] arrayRect = new Rect[0];
        for (i = 0; i < n; i++) {
            System.out.println("Inserire Height");
            height = input.nextInt();
            System.out.println("Inserire Base");
            base = input.nextInt();
            arrayRect = new Rect[]{new Rect(base, height)};
        }

    double max =  arrayRect[0].aria();
        for (int j = 1; j < n; i++) {
            if (arrayRect[j].aria()> max) {
                max = arrayRect[j].aria();
            }
            System.out.println(max);
        }




    }
}
