package edu.ucsb.cs56.drawings.dhanson.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   An iPad that extends screen.
   The iPad has apps and a homebutton and speakers
      
   @author Dylan Hanson
   @author Phill Conrad
   @version for CS56, F17, UCSB
   
*/
public class iPad extends Screen implements Shape
{
    /**
     * Constructor for objects of class iPad
     */
    public iPad(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	double wSpeaker = .33 * width;
	double hSpeaker = 0.03 * height;
	double homeButtonRadius =  0.07 * height;

	double posXSpeaker = x+ .33 *width;
	double posYSpeaker = y + hSpeaker;

	double posXHome = x+(width/2)-homeButtonRadius/2;
	double posYHome = y+ height-homeButtonRadius;

	double appSize = width/11;

	double row1Height = y + 3*appSize;
	double row2Height = row1Height + 2*appSize;
	double row3Height = row2Height + 2*appSize;
	double HBheight = y + height - 3*appSize;
	double rowX = x+ 2*appSize;
	double rowX2 = rowX +2*appSize;
	double rowX3 = rowX2 + 2*appSize;
	double rowX4 = rowX3 + 2*appSize;


	
	
	Rectangle2D.Double speaker =
	    new Rectangle2D.Double(posXSpeaker, posYSpeaker,
				   wSpeaker, hSpeaker);
	Ellipse2D.Double homeButton =
	    new Ellipse2D.Double(posXHome, posYHome,
				 homeButtonRadius, homeButtonRadius);
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

	Rectangle2D.Double app1 =
	    new Rectangle2D.Double(rowX , row1Height,
				    appSize, appSize);
	Rectangle2D.Double app2 =
	    new Rectangle2D.Double(rowX2 , row1Height,
				    appSize, appSize);
	
	Rectangle2D.Double app3 =
	    new Rectangle2D.Double(rowX3 , row1Height ,
				    appSize, appSize);
	Rectangle2D.Double app4 =
	    new Rectangle2D.Double( rowX4, row1Height,
				    appSize, appSize);
	
	Rectangle2D.Double app5 =
	    new Rectangle2D.Double(rowX , row2Height,
				    appSize, appSize);
	Rectangle2D.Double app6 =
	    new Rectangle2D.Double(rowX2 ,row2Height ,
				    appSize, appSize);
	
	Rectangle2D.Double app7 =
	    new Rectangle2D.Double( rowX3, row2Height,
				    appSize, appSize);
	Rectangle2D.Double app8 =
	    new Rectangle2D.Double(rowX4 , row2Height ,
				    appSize, appSize);
	
	Rectangle2D.Double app9 =
	    new Rectangle2D.Double(rowX ,row3Height ,
				    appSize, appSize);
	Rectangle2D.Double app10 =
	    new Rectangle2D.Double( rowX2, row3Height ,
				    appSize, appSize);

	
	Rectangle2D.Double hb1 =
	    new Rectangle2D.Double(rowX , HBheight,
				    appSize, appSize);
	Rectangle2D.Double hb2 =
	    new Rectangle2D.Double(rowX2 , HBheight,
				    appSize, appSize);
	Rectangle2D.Double hb3 =
	    new Rectangle2D.Double(rowX3 , HBheight,
				    appSize, appSize);
	Rectangle2D.Double hb4 =
	    new Rectangle2D.Double(rowX4 , HBheight,
				    appSize, appSize);
	



	

	GeneralPath pad = this.get();
        pad.append(speaker, false);
        pad.append(homeButton, false);
	pad.append(app1, false);
	pad.append(app2, false);
	pad.append(app3, false);
	pad.append(app4, false);
	pad.append(app5, false);
	pad.append(app6, false);
	pad.append(app7, false);
	pad.append(app8, false);
	pad.append(app9, false);
	pad.append(app10, false);
	pad.append(hb1, false);
	pad.append(hb2, false);
	pad.append(hb3, false);
	pad.append(hb4, false);


	
    }    
}
