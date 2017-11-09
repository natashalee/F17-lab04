package edu.ucsb.cs56.drawings.weitung_chen.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

/**
   A Saturn extended from Planet
      
   @author Wei Tung Chen
   @version for CS56, F17, UCSB
   
*/
public class Saturn extends Planet implements Shape
{
    /**
     * Constructor for objects of class Saturn
     * @param x x coordinate
     * @param y y coordinate
     * @param r radius of planet
     */
    public Saturn(double x, double y, double r)
    {
	//Call super class to construct planet
	super(x,y, r);

	//Construct saturn ring
	double d = 2 * r;
	Ellipse2D.Double ring = new Ellipse2D.Double(x - r, y + r, 2 * d, r/10);

	//Construct whole saturn
        GeneralPath wholeSaturn = this.get();
        wholeSaturn.append(ring, false);
    }    
}
