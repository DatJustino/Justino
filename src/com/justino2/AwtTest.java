package com.justino2;

import java.awt.Point;
import java.awt.Rectangle;

public class AwtTest {

  public double distance(Point p1, Point p2) {
    int dx = p2.x - p1.x;
    int dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
  }
  public void awtTesting() {
    Point blank;
    Rectangle box = new Rectangle(0, 0, 100, 200);
    blank = new Point(3,4);
    System.out.println("coordinates and size of the box below.");
    System.out.println(box);
    System.out.println("random coordinates below");
    System.out.println(blank);
    System.out.println("center of the box is below.");
    System.out.println(findCenter(box));
  }
  public static Point findCenter(Rectangle box) {
    int x = box.x + box.width / 2;
    int y = box.y + box.height / 2;
    return new Point(x, y);
  }
  public static void main(String[] args) {
    new AwtTest().awtTesting();
   //new AwtTest().Point.findCenter(Rectangle box);
  }
}
