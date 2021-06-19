package com.ori;

import org.jetbrains.annotations.NotNull;

import java.text.NumberFormat;
import java.util.Scanner;

public class yo {

    static final Scanner scanner = new Scanner(System.in);

    @org.jetbrains.annotations.Contract(pure = true)
    static @NotNull
    String question(String que){
        return "Strig";
    }

    public static void main(String[] args) {

        /**
         * Returns an Image object that can then be painted on the screen.
         * The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>. The name
         * argument is a specifier that is relative to the url argument.
         * <p>
         * This method always returns immediately, whether or not the
         * image exists. When this applet attempts to draw the image on
         * the screen, the data will be loaded. The graphics primitives
         * that draw the image will incrementally paint on the screen.
         *
         * @param  url  an absolute URL giving the base location of the image
         * @param  name the location of the image, relative to the url argument
         * @return      the image at the specified URL
         * @see         Image
         */

        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;


        System.out.print("Principal: ");
        String principal = scanner.nextLine();

        System.out.print("Annual Interest Rate: ");
        String annualInterest = scanner.nextLine();

        System.out.print("Period (Years): ");
        String years = scanner.nextLine();

        float monthlyInterestRate = Float.parseFloat(annualInterest) / PERCENT / MONTHS_IN_YEAR;


        int numberOfPayments = Byte.parseByte(years) * MONTHS_IN_YEAR;

        double mortgage = Integer.parseInt(principal)
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments / (Math.pow(1 + monthlyInterestRate, numberOfPayments) -1)));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();


    }
}
