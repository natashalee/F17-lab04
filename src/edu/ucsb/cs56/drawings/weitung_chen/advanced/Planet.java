package edu.ucsb.cs56.drawings.weitung_chen.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a planet that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Wei Tung Chen 
   @version for CS56, F17, UCSB
   
*/
public class Planet extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of planet
       @param y y coord of lower left corner of planet
       @param r radius of planet
    */
    public Planet(double x, double y, double r)
    {
        double d = 2 * r;

	//Construct each circle
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y, d, d);
	Ellipse2D.Double crater1 = new Ellipse2D.Double(x + d/2, y + d/8, d/10, d/10);
	Ellipse2D.Double crater2 = new Ellipse2D.Double(x + d/8, y + d/4, d/5, d/5);
	Ellipse2D.Double crater3 = new Ellipse2D.Double(x + d/4, y + d/2, d/20, d/20);

	//Construct planet	
        GeneralPath wholePlanet = this.get(); 
	wholePlanet.append(planet, false);
	wholePlanet.append(crater1, false);
	wholePlanet.append(crater2, false);
	wholePlanet.append(crater3, false);
    }
}
