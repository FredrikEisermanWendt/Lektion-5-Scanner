package com.Fredrik.L5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;

        do{
            int result = scanInt();

            for (int i = 0; i < result; i++){
                System.out.println(i + 1);
                System.out.println("Looping...");
            }

            if (result > 1000){
                isPlaying = false;
            }

        }while(isPlaying);


    }

    public static String scanText(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert some words:");
        String input = scan.nextLine();
        return input;
    }

    public static int scanInt(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert a number");
        return scan.nextInt();
    }

}
