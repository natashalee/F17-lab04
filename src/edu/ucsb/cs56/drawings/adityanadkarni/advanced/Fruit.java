package edu.ucsb.cs56.drawings.adityanadkarni.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
   Any Fruit

   @author Aditya Nadkarni
   @version for CS56, F17, UCSB

*/

public class Fruit extends GeneralPathWrapper implements Shape{

    public Fruit(double x, double y, double size){
      Ellipse2D.Double fruit = new Ellipse2D.Double(x, y, size*2, size*2);
      Ellipse2D.Double fruit2 = new Ellipse2D.Double(x+(size/3), y, size*2, size*2);
      //Rectangle2D.Double stem = new Rectangle2D.Double(x+size+(size/6), y-(size/5)+size/20, size/10, size/5);

      GeneralPath wholeFruit = this.get();
      wholeFruit.append(fruit, false);
      wholeFruit.append(fruit2, false);
      //wholeFruit.append(stem, false);
    }

}
