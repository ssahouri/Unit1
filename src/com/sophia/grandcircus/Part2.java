//This file takes two dates and outputs the length in days between them

package com.sophia.grandcircus;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year1, month1, day1, year2, month2, day2;

// input for first date

		System.out.print("Enter year of the first date: ");

		year1 = sc.nextInt();

		System.out.print("Enter month of the first date: ");

		month1 = sc.nextInt();

		System.out.print("Enter day of the first date: ");

		day1 = sc.nextInt();

// input for second date

		System.out.print("Enter year of the second date: ");

		year2 = sc.nextInt();

		System.out.print("Enter month of the second date: ");

		month2 = sc.nextInt();

		System.out.print("Enter day of the second date: ");

		day2 = sc.nextInt();

// converting above data to LocalDate format

		LocalDate date1 = LocalDate.of(year1, month1, day1);

		LocalDate date2 = LocalDate.of(year2, month2, day2);

// calculating and printing output

		System.out.print("The difference in days between the two dates are: ");

		long days = ChronoUnit.DAYS.between(date1, date2);

		if (days < 0)

			days = days * -1;


		System.out.println(days);

	}

}

