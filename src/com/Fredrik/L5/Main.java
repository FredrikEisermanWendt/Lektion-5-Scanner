package com.Fredrik.L5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //objects
        Scanner scan = new Scanner(System.in);
        Student benny = new Student();


        // Game: "Set age on Benny"
        do {

            System.out.println("Input Bennys age");
            int result = scan.nextInt();

            benny.age = result;

            System.out.println("You picked " + result);
            System.out.println("Bennys age is " + benny.age);

        }while(true);




    }


}
