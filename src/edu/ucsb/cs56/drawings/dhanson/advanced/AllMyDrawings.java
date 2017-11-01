package edu.ucsb.cs56.drawings.dhanson.advanced;

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
 * @author Phill Conrad 
 * @author Dylan T. Hanson
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few screens and iPads

     */
    
    public static void drawPicture1(Graphics2D g2) {
	Screen s1 = new Screen(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
     
	g2.setStroke(thick);
	g2.setColor(new Color(0x002BA7)); 
	g2.draw(h2); 
    
	// Draw two houses with Windows
	
        iPad hw1 = new iPad(50,100,747/6,956/6);

	
        iPad hw2 = new iPad(50,50,747/5,956/5);
	
	//	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few screens and iPads by Dylan Hanson", 20,20);
      
    }
    
    /** 2 ipadminis and an ipad XL
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	iPad mini1 = new iPad(0,100,747/6,956/6);
	iPad mini2 = new iPad(200,100,747/6,956/6);
	iPad XL = new iPad(400,100,747/4,956/4);
	
	g2.setColor(Color.RED);     g2.draw(mini1);
	g2.setColor(Color.GREEN);   g2.draw(mini2);
	
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(XL, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("2 iPad minis and a rotated iPadXL -DH", 20,20);
    }
    
    /** Draw a different picture with a few iPads ands screens
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("\"Think Different\" iPad Commerical - Dylan Hanson", 20,20);
	
	
	Screen bigScreen = new Screen(0,0, 600,460);
	iPad sale = new iPad(250,205,747/6,956/6);
	
	g2.setColor(Color.RED);     g2.draw(bigScreen);
	g2.setColor(Color.GREEN);   g2.draw(sale);
	
    }       
}
