package edu.ucsb.cs56.drawings.ncduncan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.ncduncan.simple.Circle;

/**
   A vector drawing of a Car that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Nicholas Duncan
   @version for CS56, F17, UCSB
   
*/
public class Car extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x-coord of top left point of car
       @param y y-coord of top left point of car
       @param width width of the car
       @param height of car (from wheel bottom to roof top)
    */
    public Car(double x, double y, double width, double height)
    {
        
        double bodyThickness = height * .5; //main body = 1/2 car
	double wheelRadius = height * .20; //wheels function of height to keep them inside body when car gets stretched
	double bodyY = y + height * .25; //yCoord of body
	double wheelY = y + (height - wheelRadius); //yCoord of wheel
	double headLightWidth = width * .1;
	double headLightHeight = height * .1;

	
        //double firstStoryUpperLeftY = y + roofHeight;
	//Make car body
	Rectangle2D.Double carBody = new Rectangle2D.Double(x, (y + (.25 * height)),width, bodyThickness);
	//Make middle window
	Rectangle2D.Double roofCenter = new Rectangle2D.Double((x + (.25 * width)), y, (width * .25), (height * .25));
	//Make back window
	Line2D.Double backWindow = new Line2D.Double((x + width * .125), bodyY, (x + width * .25), y);
	//Make front window
	Line2D.Double frontWindow = new Line2D.Double((x + width * .5), y, (x + width * .875),bodyY);
	//Make back Wheel
	Circle backWheel = new Circle((x + width * .20),wheelY, wheelRadius);
	//Make front wheel
	Circle frontWheel = new Circle((x + width * .8),wheelY, wheelRadius);
	//Make headlights
	Rectangle2D.Double headLights = new Rectangle2D.Double(x + (width - headLightWidth), bodyY + (height * .1), headLightWidth, headLightHeight);
	
        // put the whole car together
        GeneralPath completeCar = this.get();
        completeCar.append(carBody, false);
	completeCar.append(roofCenter, false);
	completeCar.append(backWindow, false);
	completeCar.append(frontWindow, false);
	completeCar.append(backWheel, false);
	completeCar.append(frontWheel, false);
	completeCar.append(headLights, false);
    }
}
