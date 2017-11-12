package edu.ucsb.cs56.drawings.dmillstein.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A CheckersBoard
      
   @author Danny Millstein 
   @version for CS56, F17, UCSB
   
*/
public class CheckersBoard extends GameBoard implements Shape
{
    /**
     * Constructor for objects of class CheckersBoard
     */
    public CheckersBoard(double x, double y, double width, double height)
    {
	// construct the basic GameBoard shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make circles on every other square of the first two rows and the last two rows with 
	// radius = .4 * columnWidth;
	// | +---+ +---+ +---+ |
        // | |   | | o | |   | |
        // | +---+ +---+ +---+ |
	// | +---+ +---+ +---+ |
	// | | o | |   | | o | |
	// | +---+ +---+ +---+ |
	// Like this for all 8 squares in the first two rows and all 8 in the last two rows
	// 
	//The center of the circle will be in the center of the square of the board it is in
	double boxWidth = .125 * width;	
	double boxHeight = .125 * height;
	double checkerWidth = 0.8 * boxWidth;
	double centerOfBox = .125 * height *.25;
	
	Ellipse2D.Double checker1 =
	    new Ellipse2D.Double(x, y + height + centerOfBox, checkerWidth, checkerWidth);
	
	Ellipse2D.Double checker2 =
            new Ellipse2D.Double(x + 2*boxWidth, y + height + centerOfBox, checkerWidth, checkerWidth);
	
	Ellipse2D.Double checker3 =
            new Ellipse2D.Double(x + 4*boxWidth, y + height + centerOfBox, checkerWidth, checkerWidth);
	
	Ellipse2D.Double checker4 =
            new Ellipse2D.Double(x + 6*boxWidth, y + height + centerOfBox, checkerWidth, checkerWidth);
	
	Ellipse2D.Double checker5 =
            new Ellipse2D.Double(x + boxWidth, y + height + centerOfBox + boxHeight, checkerWidth, checkerWidth);
	
	Ellipse2D.Double checker6 =
            new Ellipse2D.Double(x + 3*boxWidth, y + height + centerOfBox + boxHeight, checkerWidth, checkerWidth);
	
	Ellipse2D.Double checker7 =
            new Ellipse2D.Double(x + 5*boxWidth, y + height + centerOfBox + boxHeight, checkerWidth, checkerWidth);
	
	Ellipse2D.Double checker8 =
            new Ellipse2D.Double(x + 7*boxWidth, y + height + centerOfBox + boxHeight, checkerWidth, checkerWidth);

	Ellipse2D.Double checker1a =
            new Ellipse2D.Double(x, y + height + centerOfBox + 7*boxHeight, checkerWidth, checkerWidth);

        Ellipse2D.Double checker2a =
            new Ellipse2D.Double(x + 2*boxWidth, y + height + centerOfBox + 7*boxHeight, checkerWidth, checkerWidth);

        Ellipse2D.Double checker3a =
            new Ellipse2D.Double(x + 4*boxWidth, y + height + centerOfBox + 7*boxHeight, checkerWidth, checkerWidth);

        Ellipse2D.Double checker4a =
            new Ellipse2D.Double(x + 6*boxWidth, y + height + centerOfBox + 7*boxHeight, checkerWidth, checkerWidth);

        Ellipse2D.Double checker5a =
            new Ellipse2D.Double(x + boxWidth, y + height + centerOfBox + 6*boxHeight, checkerWidth, checkerWidth);

        Ellipse2D.Double checker6a =
            new Ellipse2D.Double(x + 3*boxWidth, y + height + centerOfBox + 6*boxHeight, checkerWidth, checkerWidth);

        Ellipse2D.Double checker7a =
            new Ellipse2D.Double(x + 5*boxWidth, y + height + centerOfBox + 6*boxHeight, checkerWidth, checkerWidth);

	Ellipse2D.Double checker8a =
            new Ellipse2D.Double(x + 7*boxWidth, y + height + centerOfBox + 6*boxHeight, checkerWidth, checkerWidth);


	// add the checkers to the board
	
        GeneralPath checkerBoard = this.get();
        checkerBoard.append(checker1, false);
	checkerBoard.append(checker2, false);
	checkerBoard.append(checker3, false);
	checkerBoard.append(checker4, false);
	checkerBoard.append(checker5, false);
        checkerBoard.append(checker6, false);
        checkerBoard.append(checker7, false);
        checkerBoard.append(checker8, false);
    	checkerBoard.append(checker1a, false);
   	checkerBoard.append(checker2a, false);
        checkerBoard.append(checker3a, false);
        checkerBoard.append(checker4a, false);
        checkerBoard.append(checker5a, false);
        checkerBoard.append(checker6a, false);
        checkerBoard.append(checker7a, false);
        checkerBoard.append(checker8a, false);
    }    
}
