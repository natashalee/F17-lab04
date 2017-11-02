package edu.ucsb.cs56.drawings.eshahani.advanced;

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
* @author Phill Conrad, Ekta Shahani
* @version for UCSB CS56, W16
*/

public class AllMyDrawings
{
  /** Draw a picture with a few bugs
  */

  public static void drawPicture1(Graphics2D g2) {

    Bug b1 = new Bug(100,250,50,75);
    g2.setColor(Color.CYAN); g2.draw(b1);

    // Make a black bug that's half the size,
    // and moved over 150 pixels in x direction

    Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
    b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
    g2.setColor(Color.BLACK); g2.draw(b2);

    // Here's a bug that's 4x as big (2x the original)
    // and moved over 150 more pixels to right.
    b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
    b2 = ShapeTransforms.translatedCopyOf(b2,150,0);

    // We'll draw this with a thicker stroke
    Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

    // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
    // #002FA7 is "International Klein Blue" according to Wikipedia
    // In HTML we use #, but in Java (and C/C++) its 0x

    Stroke orig=g2.getStroke();
    g2.setStroke(thick);
    g2.setColor(new Color(0x002FA7));
    g2.draw(b2);

    // Draw two ladybugs

    Ladybug l1 = new Ladybug(50,350,40,60);
    Ladybug l2 = new Ladybug(200,350,100,100);

    g2.draw(l1);
    g2.setColor(new Color(0x8F00FF)); g2.draw(l2);

    // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

    g2.setStroke(orig);
    g2.setColor(Color.BLACK);
    g2.drawString("A few bugs by Ekta Shahani", 20,20);
  }


  /** Draw a picture with a few bugs and ladybugs
  */
  public static void drawPicture2(Graphics2D g2) {

    // Draw some bugs.

    Bug large = new Bug(100,50,225,150);
    Bug small = new Bug(20,50,40,30);
    Bug tallSkinny = new Bug(20,150,20,40);
    Bug shortFat = new Bug(20,250,40,20);

    g2.setColor(Color.RED);     g2.draw(large);
    g2.setColor(Color.GREEN);   g2.draw(small);
    g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
    g2.setColor(Color.MAGENTA); g2.draw(shortFat);

    Ladybug l1 = new Ladybug(100,250,50,75);
    g2.setColor(Color.CYAN); g2.draw(l1);

    // Make a black ladybug that's half the size,
    // and moved over 150 pixels in x direction
    Shape l2 = ShapeTransforms.scaledCopyOfLL(l1,0.5,0.5);
    l2 = ShapeTransforms.translatedCopyOf(l2,150,0);
    g2.setColor(Color.BLACK); g2.draw(l2);

    // Here's a ladybug that's 4x as big (2x the original)
    // and moved over 150 more pixels to right.
    l2 = ShapeTransforms.scaledCopyOfLL(l2,4,4);
    l2 = ShapeTransforms.translatedCopyOf(l2,150,0);

    // We'll draw this with a thicker stroke
    Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

    // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
    // #002FA7 is "International Klein Blue" according to Wikipedia
    // In HTML we use #, but in Java (and C/C++) its 0x

    Stroke orig=g2.getStroke();
    g2.setStroke(thick);
    g2.setColor(new Color(0x002FA7));
    g2.draw(l2);

    // Draw a rotated ladybug

    // Rotate the second bug 45 degrees around its center.
    Shape l3 = ShapeTransforms.rotatedCopyOf(l2, Math.PI/4.0);
    l3 = ShapeTransforms.translatedCopyOf(l3,150, 50);

    g2.draw(l3);

    // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

    g2.setStroke(orig);
    g2.setColor(Color.BLACK);
    g2.drawString("Some bugs and ladybugs by Ekta Shahani", 20,20);
  }

  /** Draw a different picture with a few ladybugs
  */

  public static void drawPicture3(Graphics2D g2) {

    // label the drawing

    g2.drawString("A couple of Ladybugs by Ekta Shahani", 20,20);


    // Draw some ladybugs

    Ladybug large = new Ladybug(100,50,225,150);
    Ladybug small = new Ladybug(20,50,40,30);

    g2.setColor(Color.RED);     g2.draw(large);
    g2.setColor(Color.GREEN);   g2.draw(small);

  }
}
