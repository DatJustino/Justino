package com.justino2;

import java.util.Scanner;

public class SwitchingMonths {
  Scanner in = new Scanner(System.in);
  int month = 0;
  int monthVar = 0;
  int year = 0;
  String text = "That input is invalid, try a number between 1 & 12";

  void inputz() {
    System.out.println();
    System.out.println("Enter month number (1-12), and i will tell you the tally of days.");
    month = in.nextInt();
  }
  /*
  void year() {
    System.out.println("What year do wish to know?");
    year = in.nextInt();
    if (year % 4 == 0) {
      System.out.println("This is a leap year, this month has 29 days.");
    }
    else if (year % 4 > 0) {
      System.out.println("This month has 28 days.");}
  }*/
void yearIter () {
  System.out.println("what year do wish to know about?");
  year = in.nextInt();
  String year2 = year % 4 == 0
      ? "That is a leap year, so February of " + year + " has 29 days."
      : "February of " + year + " has 28 days.";
  System.out.println(year2);
  }
  void monthNames() {
    switch (monthVar) {
      case 1 -> System.out.print("January");
      case 2 -> System.out.print("February? We MUST know, ");
      case 3 -> System.out.print("March");
      case 4 -> System.out.print("April");
      case 5 -> System.out.print("May");
      case 6 -> System.out.print("June");
      case 7 -> System.out.print("July");
      case 8 -> System.out.print("August");
      case 9 -> System.out.print("September");
      case 10 -> System.out.print("October");
      case 11 -> System.out.print("November");
      case 12 -> System.out.print("December");
      default -> System.out.printf("%s, You entered: %d", text, month);
    }
  }
  void switchMonth() {
    while (month < 13) {
      inputz();
      monthVar = month;
      monthNames();
      switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(" has 31 days.");
        case 4, 6, 9, 11 -> System.out.println(" has 30 days.");
        case 2 -> yearIter();
        default -> System.out.printf("%s, You entered: %d", text, month);
      }
    }
  }
  public static void main(String[] args) {
    new SwitchingMonths().switchMonth();
  }
}