package edu.ucsb.cs56.drawings.eshahani.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a bug that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Ekta Shahani
   @version for CS56, F17, UCSB

*/
public class Bug extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of bug
       @param y y coord of lower left corner of bug
       @param width width of the bug
       @param height of bug
    */
    public Bug(double x, double y, double width, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

        // Make the body
        Ellipse2D.Double bugBody =
            new Ellipse2D.Double(x, y, width, height);

        // make the antennae
        Line2D.Double leftAntenna =
            new Line2D.Double (x + width/2.0, y,
                              x - width/12.0, y - height/12.0);
        Line2D.Double rightAntenna =
            new Line2D.Double (x + width/2.0, y,
                               x + width, y - height/12.0);

        //make legs
        Line2D.Double leftLeg1 =
            new Line2D.Double (x, y + height/2.0,
                               x-width/10.0, y + height/2.0);
        Line2D.Double leftLeg2 =
            new Line2D.Double (x, y + (7.0/12.0)*height,
                              x-width/10.0, y + (7.0/12.0)*height);
        Line2D.Double leftLeg3 =
            new Line2D.Double (x + width/16.0, y + (8.0/12.0)*height,
                               x-width/10.0, y + (8.0/12.0)*height);

         Line2D.Double rightLeg1 =
             new Line2D.Double (x + width, y + height/2.0,
                                x+width+width/10.0, y + height/2.0);
         Line2D.Double rightLeg2 =
             new Line2D.Double (x + width, y + (7.0/12.0)*height,
                               x+width+width/10.0, y + (7.0/12.0)*height);
         Line2D.Double rightLeg3 =
             new Line2D.Double (x + width - width/16.0, y + (8.0/12.0)*height,
                                x+width+width/10.0, y + (8.0/12.0)*height);

        // put the whole bug together
        GeneralPath wholeBug = this.get();
        wholeBug.append(bugBody, false);
        wholeBug.append(leftAntenna, false);
        wholeBug.append(rightAntenna, false);
        wholeBug.append(leftLeg1, false);
        wholeBug.append(leftLeg2, false);
        wholeBug.append(leftLeg3, false);
        wholeBug.append(rightLeg1, false);
        wholeBug.append(rightLeg2, false);
        wholeBug.append(rightLeg3, false);
    }
}
