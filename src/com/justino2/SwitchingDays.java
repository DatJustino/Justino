package com.justino2;

import java.util.Scanner;

public class SwitchingDays {
  Scanner in = new Scanner(System.in);
  int day = 0;
  String text = "This day is called: ";

  void inputz(){
    System.out.println("Enter weekday (1-7)");
    day = in.nextInt();
  }

  void nameOfDay() {
    while (day < 8) {
      inputz();
      switch (day) {
        case 1 -> System.out.println(text + "Sunday");
        case 2 -> System.out.println(text + "Monday");
        case 3 -> System.out.println(text + "Tuesday");
        case 4 -> System.out.println(text + "Wednesday");
        case 5 -> System.out.println(text + "Thursday");
        case 6 -> System.out.println(text + "Friday");
        case 7 -> System.out.println(text + "Saturday");
        default -> System.out.println(text + "UnknownDay");
      }
      }
    }
  public static void main(String[] args) {
  new SwitchingDays().nameOfDay();
  }
}