package edu.ucsb.cs56.drawings.jlguida.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
   A RubixCube

   @author Jake Guida
   @version for CS56, F17, UCSB

*/
public class RubixCubeWithCells extends RubixCube implements Shape
{
    /**
     * Constructor for objects of class RubixCube
     */
    public RubixCubeWithCells(double x, double y, double width, double height)
    {
        // construct the basic house shell
        super(x,y,width,width);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
        Rectangle2D.Double cell00 =
            new Rectangle2D.Double(x, y, width/3.0, width/3.0);
        Rectangle2D.Double cell01 =
            new Rectangle2D.Double(x, y+width/3.0, width/3.0, width/3.0);
         Rectangle2D.Double cell02 =
	     new Rectangle2D.Double(x, y+2*(width/3.0), width/3.0, width/3.0);
         Rectangle2D.Double cell10 =
            new Rectangle2D.Double(x + width/3.0, y, width/3.0, width/3.0);
         Rectangle2D.Double cell11 =
            new Rectangle2D.Double(x+width/3.0, y+width/3.0, width/3.0, width/3.0);
         Rectangle2D.Double cell12 =
	     new Rectangle2D.Double(x+width/3.0, y+2*(width/3.0), width/3.0, width/3.0);
         Rectangle2D.Double cell20 =
	     new Rectangle2D.Double(x+2*(width/3.0), y, width/3.0, width/3.0);
         Rectangle2D.Double cell21 =
	     new Rectangle2D.Double(x+2*(width/3.0), y+width/3.0, width/3.0, width/3.0);
         Rectangle2D.Double cell22 =
	     new Rectangle2D.Double(x+2*(width/3.0), y+2*(width/3.0), width/3.0, width/3.0);
          
        GeneralPath wholeCube = this.get();
        wholeCube.append(cell00, false);
	wholeCube.append(cell01, false);
        wholeCube.append(cell02, false);
        wholeCube.append(cell10, false);
        wholeCube.append(cell11, false);
        wholeCube.append(cell12, false);
        wholeCube.append(cell20, false);
        wholeCube.append(cell21, false);
        wholeCube.append(cell22, false);
   
    }
}
