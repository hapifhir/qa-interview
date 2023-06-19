package org.cdr;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String arg1 = null;
        String arg2 = null;

        System.out.println("\n\n*************************************");
        System.out.println("SMILE CDR NUMBER PROCESSING ALGORITHM");
        System.out.println(LocalDate.now());
        System.out.println("Numerical processing for clinical applications.");
        System.out.println("v1.3.8");
        System.out.println("Licensed as part of the SmileCDR super cluster ecosystem.");
        System.out.println("*************************************\n\n");
        Thread.sleep(1000);
        try {
            arg1 = args[0];
            arg2 = args[1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oh no, error 12345 caught");
        }

        int firstNumber = Integer.parseInt(arg1);
        int secondNumber = Integer.parseInt(arg2);

        System.out.println("Using machine learning algorithms mounted on the central blockchain to determine sum...");
        Thread.sleep(1000);
        System.out.println("Loading super-cluster computing VMs...");
        Thread.sleep(1000);
        System.out.println("Output determined. Margin of error determined to be +/- 1%.");

        System.out.println("\n\n*************************************");
        System.out.println("SUM -> " + (firstNumber + secondNumber));
        System.out.println("*************************************\n\n");
        Thread.sleep(1000);
        System.out.println("Shutting Down!");
    }

}