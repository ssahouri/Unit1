package com.sophia.grandcircus;

import java.util.Scanner;


public class Part1 {

  public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);

    boolean isValidInput = false;

    int number1 = 0;

    int number2 = 0;



    while (!isValidInput) {

      System.out.println("Enter your first number: ");

      number1 = sc.nextInt();



      System.out.println("Enter your second number: ");

      number2 = sc.nextInt();

      isValidInput = isValidInput(number1, number2);

    }


    System.out.println(sumMatchingDigits(number1, number2));

  }



  public static boolean isValidInput(int inputOne, int inputTwo) {



    boolean isValid = true;



    int inputOneLength = String.valueOf(inputOne).length();

    int inputTwoLength = String.valueOf(inputTwo).length();



    if (inputOneLength < 2 || inputTwoLength < 2) {

      isValid = false;

    }



    if (inputOneLength != inputTwoLength) {

      isValid = false;

    }



    return isValid;



  }



  public static boolean sumMatchingDigits(int one, int two) {

    String[] arrOne = String.valueOf(one).split("");

    String[] arrTwo = String.valueOf(two).split("");

    int[] arrThree = new int[arrOne.length];

    boolean same = true;



    for (int i = 0; i < arrOne.length; i++) {

      arrThree[i] = Integer.parseInt(arrOne[i]) + Integer.parseInt(arrTwo[i]);

    }



    int j = 1;

    int toMatch = arrThree[0];

    while (j < arrThree.length) {

      if (arrThree[j] != toMatch) {

        same = false;

        break;

      }

      j++;

    }



    return same;



  }



}
