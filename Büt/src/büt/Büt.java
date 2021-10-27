package büt;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Büt extends JFrame implements MouseListener{

 
    public static void main(String[] args) {
        Büt a=new Büt();
    }

    
   JLabel label;
   JLabel label2;
   JLabel label3;
   JLabel label4;
   JLabel label5;
   JLabel label6;
   JLabel label7;
   JLabel label8;
   JLabel label9;
   JLabel label10;
   JLabel label11;
   JLabel label12;
   JLabel label13;
   JLabel label14;
   JLabel label15;
   JLabel label16;

   
    Büt(){
        
        
        JFrame frame=new JFrame();
        frame.setTitle("Yanar&Döner");
        frame.setSize(400,419);
        frame.setLayout(new GridLayout(4,4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label=new JLabel();
        label2=new JLabel();
        label3=new JLabel();
        label4=new JLabel();
        label5=new JLabel();
        label6=new JLabel();
        label7=new JLabel();
        label8=new JLabel();
        label9=new JLabel();
        label10=new JLabel();
        label11=new JLabel();
        label12=new JLabel();
        label13=new JLabel();
        label14=new JLabel();
        label15=new JLabel();
        label16=new JLabel();
      
        /*
        label.setBounds(0, 0, 100, 100);
        label2.setBounds(0, 0, 200, 100);
        label3.setBounds(0, 0, 300, 100);
        label4.setBounds(0, 0, 400, 100);
        label5.setBounds(0, 0, 100, 200);
        label6.setBounds(0, 0, 200, 200);
        label7.setBounds(0, 0, 300, 200);
        label8.setBounds(0, 0, 400, 200);
        label9.setBounds(0, 0, 100, 300);
        label10.setBounds(0, 0, 200, 300);
        label11.setBounds(0, 0, 300, 300);
        label12.setBounds(0, 0, 400, 300);
        label13.setBounds(0, 0, 100, 400);
        label14.setBounds(0, 0, 200, 400);
        label15.setBounds(0, 0, 300, 400);
        label16.setBounds(0, 0, 400, 400);
    */
        
        label.setBackground(Color.white);
        label2.setBackground(Color.white);
        label3.setBackground(Color.white);
        label4.setBackground(Color.white);
        label5.setBackground(Color.white);
        label6.setBackground(Color.white);
        label7.setBackground(Color.white);
        label8.setBackground(Color.white);
        label9.setBackground(Color.white);
        label10.setBackground(Color.white);
        label11.setBackground(Color.white);
        label12.setBackground(Color.white);
        label13.setBackground(Color.white);
        label14.setBackground(Color.white);
        label15.setBackground(Color.white);
        label16.setBackground(Color.white);
        
    
       
        label.setOpaque(true);
       
        label2.setOpaque(true);
      
        label3.setOpaque(true);
       
        label4.setOpaque(true);
        
        label5.setOpaque(true);
      
        label6.setOpaque(true);
        
        label7.setOpaque(true);
     
        label8.setOpaque(true);
      
        label9.setOpaque(true);
        
        label10.setOpaque(true);
       
        label11.setOpaque(true);
      
        label12.setOpaque(true);
     
        label13.setOpaque(true);
      
        label14.setOpaque(true);
      
        label15.setOpaque(true);
    
        label16.setOpaque(true);
        
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(label10);
        frame.add(label11);
        frame.add(label12);
        frame.add(label13);
        frame.add(label14);
        frame.add(label15);
        frame.add(label16);
        
        label.addMouseListener(this);
        label2.addMouseListener(this);
        label3.addMouseListener(this);
        label4.addMouseListener(this);
        label5.addMouseListener(this);
        label6.addMouseListener(this);
        label7.addMouseListener(this);
        label8.addMouseListener(this);
        label9.addMouseListener(this);
        label10.addMouseListener(this);
        label11.addMouseListener(this);
        label12.addMouseListener(this);
        label13.addMouseListener(this);
        label14.addMouseListener(this);
        label15.addMouseListener(this);
        label16.addMouseListener(this);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        label.setBorder(blackline);
        label2.setBorder(blackline);
        label3.setBorder(blackline);
        label4.setBorder(blackline);
        label5.setBorder(blackline);
        label6.setBorder(blackline);
        label7.setBorder(blackline);
        label8.setBorder(blackline);
        label9.setBorder(blackline);
        label10.setBorder(blackline);
        label11.setBorder(blackline);
        label12.setBorder(blackline);
        label13.setBorder(blackline);
        label14.setBorder(blackline);
        label15.setBorder(blackline);
        label16.setBorder(blackline);
        
        
        frame.setVisible(true);
        
  

        
        
    
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         label.setBackground(Color.black);
         label2.setBackground(Color.black);
         label3.setBackground(Color.black);
         label4.setBackground(Color.black);
         label5.setBackground(Color.black);
         label6.setBackground(Color.black);
         label7.setBackground(Color.black);
         label8.setBackground(Color.black);
         label9.setBackground(Color.black);
         label10.setBackground(Color.black);
         label11.setBackground(Color.black);
         label12.setBackground(Color.black);
         label13.setBackground(Color.black);
         label14.setBackground(Color.black);
         label15.setBackground(Color.black);
         label16.setBackground(Color.black);
         
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.white);
        label2.setBackground(Color.white);
        label3.setBackground(Color.white);
        label4.setBackground(Color.white);
        label5.setBackground(Color.white);
        label6.setBackground(Color.white);
        label7.setBackground(Color.white);
        label8.setBackground(Color.white);
        label9.setBackground(Color.white);
        label10.setBackground(Color.white);
        label11.setBackground(Color.white);
        label12.setBackground(Color.white);
        label13.setBackground(Color.white);
        label14.setBackground(Color.white);
        label15.setBackground(Color.white);
        label16.setBackground(Color.white);
    }
    
}
