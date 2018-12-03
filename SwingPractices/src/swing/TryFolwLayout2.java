package swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TryFolwLayout2 {

    static JFrame aWindow = new JFrame("This is the window Title");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();

        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout();  //by default center
        flow.setHgap(20);
        flow.setVgap(30);
        flow.setAlignment(0);  //0=left, 1=center, 2=right
        
        Container content = aWindow.getContentPane();
        content.setLayout(flow);

        for (int i = 1; i <= 36; i++) {
            content.add(new JButton(" Press " + i));

        }
        aWindow.setVisible(true);
        
    }

}
