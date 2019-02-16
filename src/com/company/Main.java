package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Random random = new Random();


        int randomNr = random.nextInt(30) + 1;
        int myGuess = -10;

        while (myGuess !=randomNr){
            System.out.println("Introdu numarul!");
            myGuess = read.nextInt();

            if (myGuess==randomNr) {
                System.out.println("Ai ghicit!");
                break;
            }else if (myGuess<randomNr) {
                System.out.println("Introdu numar mai mare!");
            }else{
                System.out.println("Introdu numar mai mic");

                }
            }

        }

    }



