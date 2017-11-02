package edu.ucsb.cs56.drawings.adityanadkarni.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

import java.awt.Color;

/**
   An extension of Fruit that looks like an Apple

   @author Aditya Nadkarni
   @version for CS56, F17, UCSB

*/
public class Apple extends Fruit{
    private Color appleColor;
    /**
    Base constructor of Apple
    */
    public Apple (double x, double y, double size){
      super(x,y,size);
      appleColor = new Color(150, 0, 0);
    }

    /**
    Constructor with specific color
    */
    public Apple (double x, double y, double size, Color color){
      super(x,y,size);
      appleColor = color;
    }

    /**
    To get the color the apple is supposed to be
    */
    public Color getColor(){
      return this.appleColor;
    }

}
