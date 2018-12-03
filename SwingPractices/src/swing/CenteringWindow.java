
package swing;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;

public class CenteringWindow {
    static JFrame aWindow=new JFrame("This is the Window Title");
    
    public static void main(String[] args) {
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth=400;
        int windowHeight=150;
        
        aWindow.setBounds(center.x-windowWidth/2, center.y-windowHeight/2, windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
        
    }
    
}
