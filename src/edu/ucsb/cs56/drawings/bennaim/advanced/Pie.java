package edu.ucsb.cs56.drawings.bennaim.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pie that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Daniel Ben-Naim 
   @version for CS56, W16, UCSB
   
*/
public class Pie extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of the pie's center
       @param y y coord of the pie's center
       @param width of the pie
    */
    public Pie(double x, double y, double width)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        double crustRadius = width/2;
	double fillingRadius = width/2.3f;
        Circle crust = new Circle(x,y,crustRadius);
	Circle filling = new Circle(x,y,fillingRadius);
	
	
        GeneralPath wholePie = this.get();
        wholePie.append(crust,false);
	wholePie.append(filling,false);
    }
}
