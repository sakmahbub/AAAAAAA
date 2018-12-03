package projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class CommonMenu {
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Common Menu");
        getCommonMenu(f);
        
        f.setBounds(100, 200, 400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public static void getCommonMenu(JFrame f) {
        
        JMenuBar jmenuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        jmenuBar.add(menu);
        
        JMenu service = new JMenu("Service");
        jmenuBar.add(service);
        
        JMenu help = new JMenu("Help");
        jmenuBar.add(help);
        
        f.setJMenuBar(jmenuBar);
        
        JMenuItem item1 = new JMenuItem("New");
        Object obj = new Object();
        item1.setIcon(new javax.swing.ImageIcon(obj.getClass().getResource("/projects/mn.png")));
        item1.setMnemonic('N');
        item1.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new New().setVisible(true);
                
            }
        });
        menu.add(item1);
        
        JMenuItem item2 = new JMenuItem("About");
        item2.setMnemonic('A');
        item2.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new About().setVisible(true);
            }
        });
        menu.add(item2);
        
        JMenuItem item3 = new JMenuItem("exit");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(item3);

        ///////Service/////////
        JMenuItem item4 = new JMenuItem("Online Service");
        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new OnlineService().setVisible(true);
            }
        });
        service.add(item4);
        
        JMenuItem item5 = new JMenuItem("Home Service");
        item5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new HomeService().setVisible(true);
            }
        });
        service.add(item5);

        ///////Help/////////////
        JMenuItem item6 = new JMenuItem("Submit Problem");
        item6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Help().setVisible(true);
            }
        });
        help.add(item6);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);  //Full page
    }
}
