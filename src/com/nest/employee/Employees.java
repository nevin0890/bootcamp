package com.nest.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employees {

    public static void main(String[] args) {
        String name;
        ArrayList<String> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true)
        {
            System.out.println("1.enter the employee details");
            System.out.println("2.view");
            System.out.println("3.exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("enter the name");
                    name=sc.next();
                    s.add(name);
                    break;
                case 2:
                    System.out.println(s);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}