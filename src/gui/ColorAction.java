package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
/**
 * @author Ahana Ghosh
 * @version Autumn 2015
 * A custom class for Color icon implements Icon interface.
 */

public class ColorAction implements Icon {
  /** Height of the color icon. */
    public static final int ICON_HEIGHT = 15;
  /** Width of the color icon. */
    public static final int ICON_WIDTH = 15;
    /**Current color of the icon. */
    private final Color myColor;
    
    /**
     * Creating the constructor.
     * @param theColor is Color
     */
    public ColorAction(final Color theColor) {
        myColor = theColor;
    }
  /**
   * An overridden method that returns icon height.
   * @return it returns int
   */
    @Override
    public int getIconHeight() {
        
        return ICON_HEIGHT;
    }
    /**
     * An overridden method that returns icon width.
     * @return it returns int
     */
    @Override
    public int getIconWidth() {
        return ICON_WIDTH;
    }
    /**
     * An overridden method that paints the icon.
     */
    @Override
    public void paintIcon(final Component theComponent , 
                          final Graphics theGraphics, final int theX, final int theY) {
     
        theGraphics.setColor(myColor);
        theGraphics.fill3DRect(theX, theY, getIconWidth(), getIconHeight(), true);
      
    }

}


