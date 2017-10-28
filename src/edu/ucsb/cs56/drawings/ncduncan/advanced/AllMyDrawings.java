package edu.ucsb.cs56.drawings.ncduncan.advanced;

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
 * @author Nicholas Duncan 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few cars */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Shape c1 = new Car(100,250,200,100);
	g2.setColor(Color.RED); g2.draw(c1);
	
	// Make a black car that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK); g2.draw(c2);
	
	// Here's a car that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	Shape c3 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c3 = ShapeTransforms.translatedCopyOf(c3,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(c3);
    }
    
     /** Draw a picture of some normal cars  and
	 some racecars
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some racecars.
	
	Shape largeRacecar = new Racecar(350,50,225,150);
	Racecar smallRacecar = new Racecar(20,50,40,30);
	Racecar stretchedRacecar = new Racecar(20,150,300,50);
	Racecar weirdRacecar = new Racecar(200,250,50,100);

	//rotating large car
       	largeRacecar = ShapeTransforms.rotatedCopyOf(largeRacecar, -1 * Math.PI/4.0);
	
	g2.setColor(Color.RED);     g2.draw(largeRacecar);
	g2.setColor(Color.GREEN);   g2.draw(smallRacecar);
	g2.setColor(Color.BLUE);    g2.draw(stretchedRacecar);
	g2.setColor(Color.MAGENTA); g2.draw(weirdRacecar);

	//Drawing in a plane car
	Shape c1 = new Car(100,250,100,25);
	g2.setColor(Color.CYAN); g2.draw(c1);
	
	// Make a black car that's half the size, 
	// and moved over 150 pixels in x direction
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK); g2.draw(c2);
	
	// Draw two racecars
	
	Racecar rc1 = new Racecar(50,350,40,75);
	Racecar rc2 = new Racecar(200,350,200,100);
	
	g2.draw(rc1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second racecar 45 degrees around its center.
	Shape rc3 = ShapeTransforms.rotatedCopyOf(rc2, Math.PI/4.0);
	rc3 = ShapeTransforms.translatedCopyOf(rc3,150,-35);
	
	g2.draw(rc3);
	
	// signing and annotating drawing
	
	g2.setColor(Color.BLACK); 
	g2.drawString("Some crazy cars and racecars by Nicholas Duncan", 20,20);
    }
    
    /** Draw a different picture with some racecars
	in random positions and with random 
	colors and orientations
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Random Racecars all over the screen! by Nicholas Duncan", 20,20);
	
	
	// Randomly generated racecars!
	// Random position, color, and orientation

	for(int i = 0; i < 50; i++){
	    int carX = (int)(Math.random() * 650);
	    int carY = (int)(Math.random() * 500);
	    double carOrientation = (Math.random() * (2 * Math.PI));
	    int carR = (int)(Math.random() * 255 + 1);
	    int carG = (int)(Math.random() * 255 + 1);
	    int carB = (int)(Math.random() * 255 + 1);
	    Shape racecar = new Racecar(carX, carY, 100, 50);
	    racecar = ShapeTransforms.rotatedCopyOf(racecar, carOrientation);
	    g2.setColor(new Color(carR, carG, carB));
	    g2.draw(racecar);
	}
	
    }       
}
