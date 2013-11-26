package lab;
import java.awt.*;

import javax.swing.*;
//************************************************************
//TelephonePanel.java
//
//Lays out a (functionless) GUI like a telephone keypad with a title.
//Illustrates use of BorderLayout and GridLayout.
//************************************************************

@SuppressWarnings("serial")
public class TelephonePanel extends JPanel {
    public TelephonePanel() {
        
        JButton b1 = new JButton ("1");
        JButton b2 = new JButton ("2");
        JButton b3 = new JButton ("3");
        JButton b4 = new JButton ("4");
        JButton b5 = new JButton ("5");
        JButton b6 = new JButton ("6");
        JButton b7 = new JButton ("7");
        JButton b8 = new JButton ("8");
        JButton b9 = new JButton ("9");
        JButton bStar = new JButton ("*");
        JButton b0 = new JButton ("0");
        JButton bPound = new JButton ("#");
        
        //set BorderLayout for this panel
        setLayout (new BorderLayout());
        
        //create panel to hold title and add JPanelJLabel with "Your 
        //Telephone" title
        JPanel title = new JPanel();
        JLabel t = new JLabel("Your Telephone!!");
        title.add(t);
        
        //add title panel to north of this panel
        add (title, BorderLayout.NORTH);
        
        //create panel to hold keypad and give it a 4x3 GridLayout
        JPanel keys = new JPanel(new GridLayout(4, 3));
        
        //add buttons representing keys to key panel
        keys.add(b1);
        keys.add(b2);
        keys.add(b3);
        keys.add(b4);
        keys.add(b5);
        keys.add(b6);
        keys.add(b7);
        keys.add(b8);
        keys.add(b9);
        keys.add(bStar);
        keys.add(b0);
        keys.add(bPound);
        
        //add key panel to center of this panel
        add (keys, BorderLayout.CENTER);
    }
}