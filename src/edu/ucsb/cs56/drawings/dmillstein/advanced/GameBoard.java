package edu.ucsb.cs56.drawings.dmillstein.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a game board that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Danny Millstein
   @version for CS56, F17, UCSB
   
*/
public class GameBoard extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of board
       @param y y coord of lower left corner of board
       @param width width of the board
       @param height height of board
    */
    public GameBoard(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double heightOfRows = .125 * height;
        double widthOfColumns = .125 * width;
        double boarderUpperLeft = y + height;
        // Make the first row
        
        Rectangle2D.Double boarder = 
            new Rectangle2D.Double(x, boarderUpperLeft ,
				   width, height);
	
        // make the boxes.
        
        Line2D.Double row1 = 
            new Line2D.Double (x, y + height + heightOfRows,
                               x + width, y + height + heightOfRows);
	
	Line2D.Double row2 =    
            new Line2D.Double (x, y + height + (2*heightOfRows),
                               x + width, y + height + (2*heightOfRows));
        Line2D.Double row3 =
            new Line2D.Double (x, y + height + (3*heightOfRows),
                               x + width, y + height +  (3*heightOfRows));
        Line2D.Double row4 =
            new Line2D.Double (x, y + height + ( 4*heightOfRows),
                               x + width, y + height + (4*heightOfRows));
        Line2D.Double row5 =
            new Line2D.Double (x, y + height + (5*heightOfRows),
                               x + width, y + height + (5*heightOfRows));
        Line2D.Double row6 =
            new Line2D.Double (x, y + height + (6*heightOfRows),
                               x + width, y + height + (6*heightOfRows));
        Line2D.Double row7 =
            new Line2D.Double (x, y + height + (7*heightOfRows),
                               x + width, y + height + (7*heightOfRows));
	Line2D.Double column1 =
            new Line2D.Double (x + widthOfColumns, y + height,
                               x + widthOfColumns, y + 2*height);
	Line2D.Double column2 =
            new Line2D.Double (x + 2*widthOfColumns, y + height,
                               x + 2*widthOfColumns, y + 2*height);
	Line2D.Double column3 =
            new Line2D.Double (x + 3*widthOfColumns, y + height,
                               x + 3*widthOfColumns, y + 2*height);
	Line2D.Double column4 =
            new Line2D.Double (x + 4*widthOfColumns, y + height,
                               x + 4*widthOfColumns, y + 2*height);  
	Line2D.Double column5 =
            new Line2D.Double (x + 5*widthOfColumns, y + height,
                               x + 5*widthOfColumns, y + 2*height);
	Line2D.Double column6 =
            new Line2D.Double (x + 6*widthOfColumns, y + height,
                               x + 6*widthOfColumns, y + 2*height);
	Line2D.Double column7 =
            new Line2D.Double (x + 7*widthOfColumns, y + height,
                               x + 7*widthOfColumns, y + 2*height);

	// Assembling the board
        GeneralPath builtGameBoard = this.get();
        builtGameBoard.append(boarder, false);
        builtGameBoard.append(row1, false);
        builtGameBoard.append(column1, false); 
        builtGameBoard.append(row2, false);
        builtGameBoard.append(column2, false);  
	builtGameBoard.append(row3, false);
        builtGameBoard.append(column3, false);  
	builtGameBoard.append(row4, false);
        builtGameBoard.append(column4, false);  
	builtGameBoard.append(row5, false);
        builtGameBoard.append(column5, false);  
	builtGameBoard.append(row6, false);
        builtGameBoard.append(column6, false);  
	builtGameBoard.append(row7, false);
        builtGameBoard.append(column7, false);  	
    }
}
