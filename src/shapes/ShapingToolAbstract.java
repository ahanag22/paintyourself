package shapes;
 
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
/**
 * an abstract class for shapes.
 * @author Ahana Ghosh
 * @version Autumn 2015
 *
 */
public abstract class ShapingToolAbstract implements ShapingTools {
    /**An ArrayList of x coordinate. */
    protected List<Integer> myAX = new ArrayList<Integer>();
    /**An ArrayList of y coordinate. */
    protected List<Integer> myAY = new ArrayList<Integer>();
    /** color of the shapes. */
    protected Color myC;
    /** width of the shapes. */
    protected int myWidth;
     /**      
      * 
      * @param theX is an int.
      * @param theY is an int.
      */
    public void addPoint(final int theX, final int theY) {
        myAX.add(theX);
        myAY.add(theY);
    }
    /**
     * an abstract method that is implemented by the sub classes.
     * @param theGraphics is a Graphics
     */
    @Override
    public void draw(final Graphics theGraphics) {
        throw new UnsupportedOperationException();
    }
    /**
     * a setter method for color.
     * @param theC is c Color
     */
    public void setColor(final Color theC) {
        this.myC = theC;
    }
    /**
     * a setter method for thickness. 
     * @param theW is an int.
     */
    public void setWidth(final int theW) {
        this.myWidth = theW;
    }
}



