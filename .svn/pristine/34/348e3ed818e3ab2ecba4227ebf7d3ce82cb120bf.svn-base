/**
 * 
 */
package shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * a class that represents ellipse.
 * @author Ahana ghosh
 * @version Autumn 2015
 */
public class Ellipse extends ShapingToolAbstract {
    @Override
    public void draw(final Graphics theGraphics) {
        theGraphics.setColor(this.myC);
        if (this.myWidth > 0) {
            ((Graphics2D) theGraphics).setStroke(new BasicStroke(this.myWidth));
        
            final int x = Math.min(this.myAX.get(0), this.myAX.get(1));
            final int y = Math.min(this.myAY.get(0), this.myAY.get(1));
            final int rectWidth = Math.abs(this.myAX.get(1) - this.myAX.get(0));
            final int rectHeight = Math.abs(this.myAY.get(1) - this.myAY.get(0));
              
            ((Graphics2D) theGraphics).
             draw(new Ellipse2D.Double(x, y, rectWidth, rectHeight));          
        }
    }
}