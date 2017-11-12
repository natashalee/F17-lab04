package edu.ucsb.cs56.drawings.dhanson.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a screen that implements the Shape
   interface
      
   @author Phill Conrad
   @author Dylan Hanson
   @version for CS56, F17, UCSB
   
*/
public class Screen extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of Screen
       @param y y coord of lower left corner of Screen
       @param width width of the Screen
       @param height of Screen
    */
    public Screen(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        Rectangle2D.Double innerScreen = 
            new Rectangle2D.Double(x, y,
				   width, height);
	double num = width/9;
	int BezelLength = (int)num;

	Rectangle2D.Double outerScreen =
	    new Rectangle2D.Double(x+BezelLength, y+BezelLength, width-(2*BezelLength), height-(2*BezelLength));
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(innerScreen, false);
        wholeHouse.append(outerScreen, false);    
    }
}
