package edu.ucsb.cs56.drawings.ncduncan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.ncduncan.simple.Circle;

/**
   A vector drawing of a Racecar that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc. Adds to the design of the
   car class with a new spoiler and racing stripe
      
   @author Nicholas Duncan
   @version for CS56, F17, UCSB
   
*/
public class Racecar extends Car implements Shape
{
    /**
       Constructor
       
       @param x x-coord of top left point of car
       @param y y-coord of top left point of car
       @param width width of the car
       @param height of car (from wheel bottom to roof top)
    */
    public Racecar(double x, double y, double width, double height)
    {
	super(x, y, width, height);

	/*A new spoiler will be added to the
	  back of the car
	*/

	//width of the spoiler
	double spoilerWidth = width * .0625;
	//body height of car (used for placement)
	double bodyHeight = y + (height * .25);
	//height for main part of spoiler
	double spoilerHeight = width * .04;
	//height for racing stripe
	double stripeHeight = width * .0625;

	//Creating back line for spoiler
	Line2D.Double spoilerBack = new Line2D.Double(x, y, x,bodyHeight);

	//Creating front slanted line for spoiler
	Line2D.Double spoilerFront = new Line2D.Double(x, y + spoilerHeight, x + spoilerWidth, bodyHeight);

	//Creating spoiler block
	Rectangle2D.Double spoiler = new Rectangle2D.Double(x, y, spoilerWidth, spoilerHeight);

	//Creating racing stripe
	Rectangle2D.Double stripe = new Rectangle2D.Double(x, bodyHeight + (bodyHeight - y) / 2, width, stripeHeight);
	
        // put the whole car together
        GeneralPath completeRacecar = this.get();
	completeRacecar.append(spoilerBack, false);
	completeRacecar.append(spoilerFront, false);
	completeRacecar.append(spoiler, false);
	completeRacecar.append(stripe, false);
    
    }
    
}
