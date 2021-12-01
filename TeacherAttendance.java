package cMS_Class;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherAttendance extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    TeacherAttendance(){
       
        getContentPane().setLayout(new GridLayout(4,2,50,50));
        c2 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()){
                c2.add(rs.getString("emp_id"));    
            }
      
      
       }catch(Exception e){ }
       
        JLabel lblSelectRollNumber = new JLabel(" Select Emp id");
        lblSelectRollNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(lblSelectRollNumber);
        getContentPane().add(c2);
      
        l1 = new JLabel("  First Half");
        l1.setFont(new Font("Tahoma", Font.BOLD, 15));
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
       
        getContentPane().add(l1);
        getContentPane().add(fh);
        
        l2 = new JLabel("  Second Half");
        l2.setFont(new Font("Tahoma", Font.BOLD, 15));
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");
       
        getContentPane().add(l2);
        getContentPane().add(sh);
       
        b1 =new JButton("Submit");
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(new Color(250, 235, 215));
        
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();
        String qry = "insert into attendance_teacher values("+ id +",'"+dt+"','"+f+"','"+s+"')";
       
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    public static void main(String s[]){
        new TeacherAttendance();
    }
}

