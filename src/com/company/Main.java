package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        //Each new number in the Fibonacci sequence is calculated by adding the previous two numbers.
        // By considering the terms in the Fibonacci sequence whose values do not exceed 4 million,
        // write a program to find the sum of the even-valued terms.

        int firstNum = 0;

        int secondNum = 1;

        int max = 4000000;

        int sum = 0;

        int temp = 0;


        do{

            if (secondNum % 2 == 0) {

                sum += secondNum;
            }

            temp = firstNum + secondNum;

            firstNum = secondNum;

            secondNum = temp;

        } while (secondNum < max);


    System.out.println(sum);






    }
}
