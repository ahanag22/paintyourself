package gui;


import java.awt.BorderLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import painting.DrawingPanel;

/**
 * This class extends a JFrame that contains DrawingPanel, Tool bar and Menu bar.
 * @author Ahana Ghosh
 * @version Autumn 2015
 */
public class DrawingFrame extends JFrame {
  /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = -720269455962703613L;
    
    /** This image is used as window icon. */
    private static final String IMAGE_SOURCE = ".\\images\\w.gif";
    
    
/**
 * This is a constructor.
 * constructor is taking no parameters.
 */
    public DrawingFrame() {
        super("PowerPaint");        
        final File iconImageFile = new File(IMAGE_SOURCE);
        final String iconImageFilePath = iconImageFile.getAbsolutePath();
        final ImageIcon img = new ImageIcon(iconImageFilePath);
        this.setIconImage(img.getImage());
        
    }
    /**
     * This method adds DrawingPanel to the JFrame.
     * This method adds menu bar and tool bar  to the JFrame.
     * Main calls this method.
     */
    public void start() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
      
        //Create and set up the content pane.
        final DrawingPanel drawingArea = new DrawingPanel(); 
        drawingArea.init();
        
        final Menu m = new Menu();
        setJMenuBar(m.createMenuBar(drawingArea));         
        add(drawingArea,  BorderLayout.CENTER);
                
        final Tools tb = new Tools();
        add(tb.createToolBar(drawingArea), BorderLayout.PAGE_END);                

        // Link Menubar and Toolbar with Frame
        drawingArea.linkMenuBar(m);
        drawingArea.linkToolBar(tb);
        
        //Display the window.
        setResizable(true);
        pack();
        setVisible(true);     
    }
}
