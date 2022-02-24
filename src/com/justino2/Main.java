package com.justino2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  Scanner in = new Scanner(System.in);
  String name;
  String rev;

  public void whileFun() {
    do {
      System.out.println("Enter your name: ");
      name = in.nextLine().toUpperCase(Locale.ROOT);
    }
    while (name.length() < 3);
    System.out.print("I think ive got your name backwards: ");
    for (int i = name.length(); i > 0; i--)
      System.out.print(name.charAt(i - 1));
  }

  public static void main(String[] args) {
    new Main().whileFun();
  }
}


//int answer;
//int count;
//  boolean keepGoing = true;

    /*for (char i = 'A'; i <= 'Z' ;i++){
      System.out.print(i + " ");}
    System.out.println("");
      for (char j = 'Z'; j >= 'A' ;j--){
        System.out.print(j + " ");
    }*/




  /*  System.out.println("enter a number, enter 99 to quit");
    while (keepGoing) {
      answer = in.nextInt();
      System.out.println("answer != 99, you answer is: " + answer);
      if (answer == 99){
        keepGoing = false;
      }
    }*/

    /* boolean realName = true;
   /*
    /*
  do {
    realName = true;
    System.out.println("enter a name!");
    answer = in.nextLine();
  }
    while (answer.length() < 3);
    if (answer.length() >= 3) {
      realName = false;
      System.out.println("your name is: " + answer);
    }
    */
/*
  String answer;

  {

    System.out.println("enter text here, write 'quit' to .. quit.");
    answer = in.nextLine();
    while (!answer.equalsIgnoreCase("quit")) {
      System.out.println("you've entered: "+ answer);
      System.out.println("enter new text: ");
      answer = in.nextLine();
    }
  }*/


