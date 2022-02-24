package com.justino2;
import java.util.Scanner;
public class testing {
  Scanner in = new Scanner(System.in);

  int askUserhowManyFoods() {
    int numOfFoods;
      System.out.println("how many foods?");
      numOfFoods = in.nextInt();
      in.nextLine(); //scanner bug
      return numOfFoods;
  }
  //we input the datatype and which variable we are using, in this case an
  // integer called num which is the variable input by the user
  String[] askUserToInputFoods(int num) {
    String[] inputFoods = new String[num];
    for (int i = 0; i < num; i++)
      System.out.println("enter foods #" + (i + 1));
    return inputFoods;
  }
  void printList(String[] foods) {
    System.out.println("\nListOF FOODS:");
    for (int i = 0; i < foods.length; i++)
      System.out.println("#" + i + 1 + ":" + foods[i]);
  }
  void go()
  {
    //String food;
    int numFoods;
    String[] foods = new String[25];

    numFoods = askUserhowManyFoods();
    foods = askUserToInputFoods(numFoods);
    printList(foods);
  }
  public static void main(String[] args)
  {
    new testing().go();
  }
}