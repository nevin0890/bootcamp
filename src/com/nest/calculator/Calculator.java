package com.nest.calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        int c,a,b;
        System.out.println("enter the 2 numbers");
        Scanner  s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        while (true)
        {
            System.out.println("select an option");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Devision");
            System.out.println("4. Multiplication");
            System.out.println("5. exit");
            c=s.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Sum="+(a+b));
                    break;
                case 2:
                    System.out.println("Sub="+(a-b));
                    break;
                case 3:try {
                    System.out.println("Sum=" + (a / b));
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Arithemetic exception "+e);
                }
                    break;

                case 4:
                    System.out.println("Sum="+(a*b));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }


        }
    }
}
