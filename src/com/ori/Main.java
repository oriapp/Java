package com.ori;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

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
