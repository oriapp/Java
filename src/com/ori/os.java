package com.ori;

public class os {
    public static void main(String args[]){
        System.out.println(1);
        System.getProperties().list(System.out);
        String x = System.getProperty("os.name");
        System.out.println("\n");
        System.out.println(x);

    }
}
