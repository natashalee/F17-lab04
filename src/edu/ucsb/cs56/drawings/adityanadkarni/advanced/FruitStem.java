package edu.ucsb.cs56.drawings.adityanadkarni.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
   An extra thing to make fruits look better

   @author Aditya Nadkarni
   @version for CS56, F17, UCSB

*/

public class FruitStem extends GeneralPathWrapper implements Shape{

    /**
    Constructs a fruit stem based on the position and size of the fruit
    */
    public FruitStem(double x, double y, double size){
      Rectangle2D.Double stem = new Rectangle2D.Double(x+size+(size/6), y-(size/5)+size/20, size/10, size/5);

      GeneralPath stemPath = this.get();
      stemPath.append(stem, false);
    }

}
