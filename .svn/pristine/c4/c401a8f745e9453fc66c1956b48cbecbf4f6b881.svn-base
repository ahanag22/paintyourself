/**
 * 
 */
package shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * a class represents a rectangle.
 * @author Ahana Ghosh
 * @version Autumn 2015
 *
 */
public class Rectangle extends ShapingToolAbstract {
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
            draw(new Rectangle2D.Double(x, y, rectWidth, rectHeight)); 
        
        }
    }
}