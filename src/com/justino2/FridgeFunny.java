package com.justino2;

import java.util.Scanner;

public class FridgeFunny {
  Scanner in = new Scanner(System.in);

  void amountOfFood() {
    System.out.println("Enter amount of food to buy: ");
    int numOfFood = in.nextInt();
    for (int i = 0; i < numOfFood; i++) {
      int[] foodTally = new int[10];
    }

  /*String[] inputFood(int num) {
    String[] foodItemsArray = new String[num];
    System.out.println("Enter which food to buy: ");
    String foodItems = in.nextLine();
    for (int i = 0; i < num; i++)
      System.out.println("item: #" + (i + 1));
    return foodItemsArray;
  }
*/
    //void go () {

     // new FridgeFunny().amountOfFood();
      //  new FridgeFunny().inputFood(numOfFood);
    }
  //}

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //new FridgeFunny().go();
    System.out.println("Enter amount of food to buy: ");
    int numOfFood = in.nextInt();
    for (int i = 0; i < numOfFood; i++) {
      int[] foodTally = new int[i];
      System.out.println(foodTally[i]);
    }
  }
}