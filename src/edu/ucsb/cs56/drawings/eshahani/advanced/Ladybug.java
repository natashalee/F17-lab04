package edu.ucsb.cs56.drawings.eshahani.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

public class Ladybug extends Bug implements Shape {
  public Ladybug(double x, double y, double width, double height) {
    super(x, y, width, height);

    // double h = x + width/2.0;
    // double k = y + height/2.0;
    // double a = height/2.0;
    // double b = width/2.0;
    // double xOfHead = Math.sqrt(Math.pow(b, 2)*(1 - (Math.pow(y-k, 2))/Math.pow(a, 2))) + h;
    //
    // Line2D.Double test = new Line2D.Double(xOfHead, y + height/3.0, xOfHead + 2, y + height/3.0);

    //draw wing separation
    Line2D.Double wing =
      new Line2D.Double(x+width/2.0, y+height/3.0,
                        x+width/2.0, y+height);
    //draw head separation
    Line2D.Double head =
      new Line2D.Double(x+width/16.0, y+height/3.0,
                        x+width-width/16.0, y+height/3.0);

    //draw circles
    double cDim = width/12.0;
    Ellipse2D.Double leftC1 =
      new Ellipse2D.Double(x+width/2.0 - cDim*1.5, y+height - cDim*2.0,
                          cDim, cDim);

    Ellipse2D.Double leftC2 =
      new Ellipse2D.Double(x + cDim*2.0, y+height/2.0 + cDim*2.0,
                          cDim, cDim);

    Ellipse2D.Double leftC3 =
      new Ellipse2D.Double(x+width/2.0 - cDim*2, y+height/3.0 + cDim*2.0,
                          cDim, cDim);

    Ellipse2D.Double rightC1 =
      new Ellipse2D.Double(x+width/2.0 + cDim*1.5, y+height - cDim*2.0,
                          cDim, cDim);

    Ellipse2D.Double rightC2 =
      new Ellipse2D.Double(x+width - cDim*3.0, y+height/2.0 + cDim*2.0,
                          cDim, cDim);

    Ellipse2D.Double rightC3 =
      new Ellipse2D.Double(x+width/2.0 + cDim*2, y+height/3.0 + cDim*2.0,
                          cDim, cDim);

    GeneralPath wholeBug = this.get();
  //  wholeBug.append(test, false);
    wholeBug.append(wing, false);
    wholeBug.append(head, false);
    wholeBug.append(leftC1, false);
    wholeBug.append(leftC2, false);
    wholeBug.append(leftC3, false);
    wholeBug.append(rightC1, false);
    wholeBug.append(rightC2, false);
    wholeBug.append(rightC3, false);
  }
}
