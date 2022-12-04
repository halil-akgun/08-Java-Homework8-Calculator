package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("first number: ");
        n1 = input.nextInt();
        System.out.print("second number: ");
        n2 = input.nextInt();
        System.out.print("\n1: addition\n2: subtraction\n3: multiplication\n4: division\noperation type: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("a number cannot be divided by 0");
                } else {
                    double temp1 = n1;
                    double temp2 = n2;
                    double temp3 = temp1 / temp2;
                    System.out.println(temp3);
                }
                break;
            default:
                System.out.println("you made the wrong choice. try again.");
        }
    }
}