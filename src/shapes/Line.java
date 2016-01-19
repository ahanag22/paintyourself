/**
 * 
 */
package shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * a class that represents Line.
 * @author Ahana Ghosh
 * @version Autumn 2015
 */
public class Line extends ShapingToolAbstract {
    @Override
    public void draw(final Graphics theGraphics) {
        theGraphics.setColor(this.myC);
        if (this.myWidth > 0) {
            ((Graphics2D) theGraphics).setStroke(new BasicStroke(this.myWidth));
            ((Graphics2D) theGraphics).
                draw(new Line2D.Double(this.myAX.get(0), 
                                   this.myAY.get(0), this.myAX.get(1), this.myAY.get(1)));
       
        }
    }
}