package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     /*   Scanner scanner = new Scanner(System.in);

        System.out.println("Input the fist number: ");
        int number1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Input third number: ");
        int number3 = scanner.nextInt();

        int smallest;

        if (number1 < number2) {
            smallest = number1;
        } else {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        System.out.println("The smallest number is: " + smallest);
*/
    //    task2();
        task3();
    }

 /*   static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input students percentage: ");
        int percentage = scanner.nextInt();

        char grade;

        if (percentage > 90) {
            grade = 'A';
        } else if (percentage > 75) {
            grade = 'B';
        } else if (percentage > 65) {
            grade = 'C';
        }    else {
                    grade = 'D';
                }

        System.out.println("The students grade is: " + grade);
    }
*/
        static void task3 () {

            Scanner scanner = new Scanner(System.in);

            System.out.println("What's the temperature today?");
            int temperature = scanner.nextInt();

            if (temperature >= 80) {
                System.out.println("Go to the pool?");
            } else if (temperature >= 60) {
                System.out.println("Go play tennis!");
            } else if (temperature >= 40) {
                System.out.println("It's a perfect day for golf!");
            } else if (temperature >= 40) {
                System.out.println("Let's go skiing!");
            } else if ( temperature > 95   ||  temperature < 20 )
                System.out.println("Visit to our shops!") ;
            {

            }
        }
    }





