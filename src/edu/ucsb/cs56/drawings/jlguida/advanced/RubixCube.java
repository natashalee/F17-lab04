package edu.ucsb.cs56.drawings.jlguida.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a cube that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Jake Guida
   @version for CS56, F17, UCSB

*/
public class RubixCube extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the cube
    */
    public RubixCube(double x, double y, double width, double height)
    {
        Rectangle2D.Double outerSquare =
            new Rectangle2D.Double(x, y,
                                   width, width);

        GeneralPath wholeCube = this.get();
        wholeCube.append(outerSquare, false);
    }
}
