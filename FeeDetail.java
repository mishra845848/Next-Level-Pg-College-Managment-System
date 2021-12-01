package cMS_Class;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class FeeDetail extends JFrame implements ActionListener{
 
    JLabel l1;
    JTable t1;
    JTextField t2;
    String x[] = {"rollno","name","fathers_name","course","branch","semester","fee_paid"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    FeeDetail(){
        super("Fee Detail");
        setSize(1260,650);
        setLocation(200,200);
        getContentPane().setLayout(null);
        
        
        try{
            conn c1  = new conn();
            String s1 = "select * from fee";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("rollno");
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fathers_name");
                y[i][j++]=rs.getString("course");
                y[i][j++]=rs.getString("branch");
                y[i][j++]=rs.getString("semester");
                y[i][j++]=rs.getString("fee_paid");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        getContentPane().add(sp);
        
        getContentPane().setBackground(new Color(250, 235, 215));
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    }
    public static void main(String[] args){
        new FeeDetail().setVisible(true);
    }
    
}