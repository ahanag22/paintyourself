package gui;


import java.awt.EventQueue;

/**
* class does have the main method.
* @author Ahana Ghosh
* @version Autumn 2015
*/
public final class DrawingFrameGuiMain {
    
    /**
     * Private constructor, to prevent instantiation of this class.
     */
    private DrawingFrameGuiMain() {
        throw new IllegalStateException();
    }
    
    /**
     * The main method. Command line arguments are
     * ignored.
     * 
     * @param theArgs Command line arguments.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrawingFrame().start();
            }
        });
    }
}
