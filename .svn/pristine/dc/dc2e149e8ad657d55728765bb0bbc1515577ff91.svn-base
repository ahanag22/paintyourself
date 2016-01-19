package gui;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import painting.CustomActionListener;
import painting.DrawingPanel;
import shapes.Ellipse;
import shapes.Line;
import shapes.Pencil;
import shapes.Rectangle;
import shapes.ShapingToolAbstract;

/**
 * 
 * @author Ahana Ghosh
 * @version Autumn 2015
 * A class that represents tool bar
 */
public class Tools {
    /** a ButtonGroup. */
    private ButtonGroup myGroup;
    /** a ToggleButton. */
    private JToggleButton myButton1;
    /** a ToggleButton. */
    private JToggleButton myButton2;
    /** a ToggleButton. */
    private JToggleButton myButton3;
    /** a ToggleButton. */
    private JToggleButton myButton4;
    
    
    /**
     * a method creates tool bar.
     * @param thePanel is a DrawingPanel.
     * @return it returns JToolbBar
     * 
     */
    public JToolBar createToolBar(final DrawingPanel thePanel) {
        //create a tool bar
        final JToolBar toolbar;
        toolbar = new JToolBar();
        this.myGroup = new ButtonGroup();
        this.myButton1 = new JToggleButton("Pencil");
        this.myGroup.add(myButton1);
        this.myButton1.setMnemonic('P');
        this.myButton1.addActionListener(new CustomActionListener(new Pencil(), thePanel));
        this.myButton1.setIcon(new ImageIcon(".\\images\\pencil_bw.gif"));
        toolbar.add(myButton1);
        this.myButton1.setSelected(true);
        
        this.myButton2 = new JToggleButton("Line");
        this.myGroup.add(myButton2);
        this.myButton2.setMnemonic('L');
        this.myButton2.addActionListener(new CustomActionListener(new Line(), thePanel));
        this.myButton2.setIcon(new ImageIcon(".\\images\\line_bw.gif"));
        toolbar.add(myButton2);
        
        this.myButton3 = new JToggleButton("Rectangle");
        this.myGroup.add(myButton3);
        this.myButton3.setMnemonic('R');
        this.myButton3.addActionListener(new CustomActionListener(new Rectangle(), thePanel));
        this.myButton3.setIcon(new ImageIcon(".\\images\\rectangle_bw.gif"));
        toolbar.add(myButton3);
        
        this.myButton4 = new JToggleButton("Ellipse");
        this.myGroup.add(myButton4);
        this.myButton4.setMnemonic('E');
        this.myButton4.addActionListener(new CustomActionListener(new Ellipse(), thePanel));
        this.myButton4.setIcon(new ImageIcon(".\\images\\ellipse_bw.gif"));
        toolbar.add(myButton4);
        return toolbar;
    }    
    /**
     * @param theTool is a ShapingTool.
     * @returns void 
     */
    public void setSelected(final ShapingToolAbstract theTool) {
        if (theTool instanceof Pencil) {
            this.myGroup.setSelected(this.myButton1.getModel(), true);
        } else if (theTool instanceof Line) {
            this.myGroup.setSelected(this.myButton2.getModel(), true);
        } else if (theTool instanceof Rectangle) {
            this.myGroup.setSelected(this.myButton3.getModel(), true);
        } else if (theTool instanceof Ellipse) {
            this.myGroup.setSelected(this.myButton4.getModel(), true);
        }
    }
}


    