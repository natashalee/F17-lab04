package edu.ucsb.cs56.drawings.adityanadkarni.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Aditya Nadkarni
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /** Draw a picture with a red apple
     */

    public static void drawPicture1(Graphics2D g2) {
      Apple a1 = new Apple(200, 100, 100);
      g2.setColor(a1.getColor()); g2.draw(a1); g2.fill(a1);
      FruitStem fs = new FruitStem (200, 100, 100);
      g2.setColor(new Color(153, 76, 0)); g2.draw(fs); g2.fill(fs);

    	g2.setColor(Color.BLACK);
    	g2.drawString("A red apple by Aditya Nadkarni", 20,20);
    }


    /** Draw a picture with a green apple
     */
    public static void drawPicture2(Graphics2D g2) {

      Apple a1 = new Apple(200, 100, 100, new Color(128, 255, 0));
      g2.setColor(a1.getColor()); g2.draw(a1); g2.fill(a1);
      FruitStem fs = new FruitStem (200, 100, 100);
      g2.setColor(new Color(153, 76, 0)); g2.draw(fs); g2.fill(fs);

    	g2.setColor(Color.BLACK);
    	g2.drawString("A green apple by Aditya Nadkarni", 20,20);
    }

    /** Draw a different picture with many apples of changing colors
     */

    public static void drawPicture3(Graphics2D g2) {
        for (int i = 0; i < 4; i++){
          for (int j = 0; j < 4; j++){
            Apple a1 = new Apple(50+(125*j), 50+(150*i), 50, new Color (200-(25*i), 0, 0));
            g2.setColor(a1.getColor()); g2.draw(a1); g2.fill(a1);
            FruitStem fs = new FruitStem (50+(125*j), 50+(150*i), 50);
            g2.setColor(new Color(153, 76, 0)); g2.draw(fs); g2.fill(fs);
          }
        }

      	g2.setColor(Color.BLACK);
      	g2.drawString("Many apples by Aditya Nadkarni", 20,20);

    }
}
