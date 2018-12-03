package swing;

import javax.swing.JFrame;

public class FramingWindow {

    static JFrame aWindow = new JFrame("This is the Window Title");

    public static void main(String[] args) {
        int windowWidth=400;
        int windowHight=150;
        
      aWindow.setBounds(50,100, windowWidth, windowHight);
      
      aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      aWindow.setVisible(true);

    }

}
