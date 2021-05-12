package com.ori;
import java.io.*;

public class cmd {

        public static void main(String[] args) throws Exception {
//            Process runtime = Runtime.getRuntime().exec("cmd /c start cmd.exe");
            try
            {
                Runtime.getRuntime().exec("cmd /c start cmd.exe /K \" git push -u origin main\"");
            }
            catch (Exception e)
            {
                System.out.println("Something went wrong \\:");
                e.printStackTrace();
            }
        }
}
