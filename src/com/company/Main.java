package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a marks.");
        int totalmark = input.nextInt();

        System.out.println("how many student are there?");
        int students = input.nextInt();
        for (int i = 0; i < students; i++) {


            System.out.println("please enter a mark.");
            int mark = input.nextInt();
            double grade = (double) mark / totalmark * 100;
            if (grade > 100) {
                System.out.println("you have reached an end this is not a proper value");
            }
            if (grade >= 80 && grade <= 100) {
                System.out.println("wow you got an A!");

            } else {
                if (grade >= 70 && grade <= 79) {
                    System.out.println("nice work you got a B");

                } else {
                    if (grade >= 60 && grade <= 69) {
                        System.out.println("not bad you got a C");

                    } else {
                        if (grade >= 50 && grade <= 59) {
                            System.out.print("better luck next time, you got a D");

                        } else {
                            if (grade >= 40 && grade <= 49) {
                                System.out.print("Unlucky you got an E");

                            } else {
                                if (grade < 40) {
                                    System.out.print("you have attained a U :(");
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}
