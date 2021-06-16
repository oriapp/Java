package com.ori;

import java.util.Scanner;

public class type {

//    static { System.loadLibrary("Dotenv"); }
    public static void main(String args[]){

//        Runtime.getRuntime().loadLibrary(System.loadLibrary());

        Scanner x = new Scanner(System.in);

        System.out.println("Type something");
        String something = x.nextLine();

        System.out.println(something.getClass().getSimpleName());

    }
}
