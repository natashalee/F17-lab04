package edu.ucsb.cs56.drawings.bennaim.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Daniel Ben-Naim 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few pies 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pie p1 = new Pie(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a pie that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a pie that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two pizzas
	
	CircularPizza pz1 = new CircularPizza(50,350,40);
	CircularPizza pz2 = new CircularPizza(200,350,100);
	
	g2.draw(pz1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pz2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few pies by Daniel Ben-Naim", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
		
	Pie p1 = new Pie(450,250,50);
	g2.setColor(Color.RED); g2.draw(p1);
	
	// Make a pie house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,150);
	g2.setColor(Color.GREEN); g2.draw(p2);
	
	// We won't draw this with a thicker stroke
	//Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	//Stroke orig=g2.getStroke();
	//g2.setStroke(thick);
	g2.setColor(new Color(0x33b5e5)); 
	g2.draw(p2); 
	
	// Draw two houses with Windows
	
	CircularPizza pz1 = new CircularPizza(50,350,40);
	CircularPizza pz2 = new CircularPizza(200,350,100);
	CircularPizza pz3 = new CircularPizza(100, 200, 40);
	
	g2.draw(pz1);
	g2.setColor(new Color(0x555555)); g2.draw(pz2);
	g2.setColor(new Color(0x123456)); g2.draw(pz3);
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	//g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few pies in a different arrangement by Daniel Ben-Naim", 20,20);
    
    }
    
    /** Draw a different picture with just pizzas
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Small, medium, and large pizzas by Daniel Ben-Naim", 20,20);
	
	
	// Draw some coffee cups.
	CircularPizza small = new CircularPizza(75,200,100);
	CircularPizza medium = new CircularPizza(225,200,150);
	CircularPizza large = new CircularPizza(425,200,200);
	g2.setColor(Color.BLUE); g2.draw(small);
	g2.setColor(Color.RED);     g2.draw(medium);
	g2.setColor(Color.GREEN);   g2.draw(large);
	
    }       
}
