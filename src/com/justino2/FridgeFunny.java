package com.justino2;

import java.util.Scanner;

public class FridgeFunny {
  Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
     new FridgeFunny().howManyToBuy();
}
  void howManyToBuy() {
    int count = 0;
    System.out.println("Calculate and enter amount of items to buy, so you bring enough bags: ");
    String[] foodToBuy = new String[in.nextInt()];
    in.nextLine();
    System.out.println("Enter items to buy: ");
    for (int i = 0; i < foodToBuy.length; i++) {
        String food = in.nextLine();
        foodToBuy[i] = food;
      System.out.println("Continue entering items: ");
      }
      for (String j: foodToBuy) {
        System.out.printf("Item: #%d %s.\n", ++count, j);
      }}}
