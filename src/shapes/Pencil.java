/**
 * 
 */
package shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * a class that represents pencil.
 * @author Ahana Ghosh
 * @version Autumn 2015
 */
public class Pencil extends ShapingToolAbstract {
    @Override
    public void draw(final Graphics theGraphics) {
        theGraphics.setColor(this.myC);
        if (this.myWidth > 0) {
            ((Graphics2D) theGraphics).setStroke(new BasicStroke(this.myWidth));
            for (int i = 0; i < this.myAX.size() - 1; i++) {
                theGraphics.drawLine(this.myAX.get(i), 
                                 this.myAY.get(i), this.myAX.get(i + 1), this.myAY.get(i + 1));
            
            } 
        }

    }
}