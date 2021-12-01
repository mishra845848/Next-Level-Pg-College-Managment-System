package cMS_Class;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
             new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Next-Level PG College ");
            setBackground(new Color(173, 216, 23));
           
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            contentPane.setForeground(new Color(47, 79, 79));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(this.getClass().getResource("/next.png"));
            Image i2 = i1.getImage().getScaledInstance(400, 200,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(105, 146, 478, 173);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Next-Level PG College");
            l3.setToolTipText("");
            l3.setVerticalAlignment(SwingConstants.TOP);
            l3.setForeground(new Color(204, 51, 0));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 60));
            l3.setBounds(27, 27, 643, 81);
            contentPane.add(l3);


            JLabel l6 = new JLabel("Study on Next Level ........................");
            l6.setForeground(new Color(184, 134, 11));
            l6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
            l6.setBounds(256, 101, 402, 26);
            contentPane.add(l6);
              
            JLabel l50 = new JLabel("Contact US");
            l50.setForeground(new Color(0, 0, 255));
            l50.setFont(new Font("Times New Roman", Font.BOLD, 30));
            l50.setBounds(250, 329, 154, 40);
            contentPane.add(l50);
            
            JLabel l8 = new JLabel("Mail us : Nextlevelpgcollege@gmail.com");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(157, 374, 384, 34);
            contentPane.add(l8);


            JLabel l10 = new JLabel("Phone - +91 8787213738");
            l10.setForeground(UIManager.getColor("menuPressedItemB"));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(233, 415, 235, 26);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
}
