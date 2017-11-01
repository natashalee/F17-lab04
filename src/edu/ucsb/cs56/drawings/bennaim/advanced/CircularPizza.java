package edu.ucsb.cs56.drawings.bennaim.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

/**
   A Circular Pizza
      
   @author Daniel Ben-Naim 
   @version for CS56, W16, UCSB
   
*/
public class CircularPizza extends Pie implements Shape
{
    /**
     * Constructor for objects of class CircularPizza
     */
    public CircularPizza(double x, double y, double width)
    {
	// construct the basic house shell
	super(x,y,width);
	double peppRadius = width/10;
	double offset = width/5;
	// construct pepperonis
	
	Circle pepp1 = new Circle(x+offset,y+offset,peppRadius);
	Circle pepp2 = new Circle(x+offset,y-offset,peppRadius);
	Circle pepp3 = new Circle(x-offset,y-offset,peppRadius);
	Circle pepp4 = new Circle(x-offset,y+offset,peppRadius);
	Circle pepp5 = new Circle(x,y,peppRadius);
	
	// add pepperonis
	
        GeneralPath wholePizza = this.get();
        wholePizza.append(pepp1, false);
        wholePizza.append(pepp2, false);
        wholePizza.append(pepp3, false);
	wholePizza.append(pepp4, false);
	wholePizza.append(pepp5, false);
	
    }    
}
