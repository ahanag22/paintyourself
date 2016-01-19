package painting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import shapes.ShapingToolAbstract;
/**
 * a class that implements ActionListener.
 * @author Ahana Ghosh
 * @version Autumn 2015
 */
public class CustomActionListener implements ActionListener {
    /** the current tool in use. */
    private final ShapingToolAbstract myCurrentTool;
    /** a drawing panel. */
    private final DrawingPanel myPanel;
/**
 * 
 * @param theS is an AbstractShapingTool.
 * @param theD is a DrawingPanel.
 */
    public CustomActionListener(final ShapingToolAbstract theS, final DrawingPanel theD) {
        this.myCurrentTool = theS;
  
        this.myPanel = theD;
    }
/**
 * an overridden method .
 * @param theEvent is an ActionEvent.
 */
    public void actionPerformed(final ActionEvent theEvent) {
    
        this.myPanel.setCurrentShapingTool(this.myCurrentTool);
    }
}

