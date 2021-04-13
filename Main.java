package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");

        int ageLimit = 21;
        int age = Integer.parseInt(input.nextLine());

        if (age >= ageLimit) {
            System.out.println("Your age is " + age + " so you are old enough to drink");
        } else {
            System.out.println("You are too young to drink!");
        }

        int startingNumber = 0;
        while (startingNumber < 15) {
            System.out.println("This number is now " + startingNumber);
            startingNumber++;
        }

        java.lang.String myName = "Marcus Harris";
        System.out.println("My full name is " + myName + " and I am " + age + " years old!");
        System.out.println(myName.indexOf('H'));
    }
}
