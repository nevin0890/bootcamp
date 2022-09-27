package com.nest.hotel;
import java.util.Scanner;

public class Hotel {
    static int total=0;
    public static void main(String[] args) {

        int choice;

        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("enter the choice");
            System.out.println("1.Tea 10$");
            System.out.println("2.Cake 30$");
            System.out.println("3.juice 35$");
            System.out.println("4.ice15$");
            System.out.println("6.BILL");
            System.out.println("7.exit");
            choice=s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("how many quantity");
                    int m = s.nextInt();
                    total = (10 * m) + total;
                    break;
                case 2:
                    System.out.println("how many quantity");
                    int n = s.nextInt();
                    total = (30 * n) + total;
                    break;
                case 3:
                    System.out.println("how many quantity");
                    int o = s.nextInt();
                    total = (10 * o) + total;
                    break;
                case 4:
                    System.out.println("how many quantity");
                    int l = s.nextInt();
                    total = (15 * l) + total;
                    break;
                case 5:
                    System.out.println("how many quantity");
                    int p = s.nextInt();
                    total = (35 * p) + total;
                    break;
                case 6:System.out.println("total bill="+total);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }

    }
}