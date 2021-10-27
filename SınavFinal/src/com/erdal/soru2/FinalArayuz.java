package com.erdal.soru2;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FinalArayuz extends JFrame{
    
        private JButton kirmizi;
        private JButton mavi;
        private JButton yesil;
        private JButton siyah;
        private GridLayout experimentLayout;
                
    public FinalArayuz() {
         
        Ekran(); 
        
    }
    public void Ekran(){
         
        kirmizi = new javax.swing.JButton();
        mavi = new javax.swing.JButton();
        yesil = new javax.swing.JButton();
        siyah = new javax.swing.JButton();
        experimentLayout = new GridLayout(2,2);
        
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setTitle("Renkler");
         setSize(400,420);

        kirmizi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                  String rnk = "KIRMIZI";
                
                  Renk(rnk);           
            }
        });
        
        mavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                
                String rnk = "MAVİ";
                  Renk(rnk);         
            }
        });
        
        yesil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                
                String rnk = "YESİL";
                  Renk(rnk);            
            }
        });
        
        siyah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                String rnk = "SİYAH";
                  Renk(rnk);           
            }
        });  
        kirmizi.setBackground(Color.red);
        yesil.setBackground(Color.green);
        mavi.setBackground(Color.blue);
        siyah.setBackground(Color.black);

        setLayout(experimentLayout);
        
        add(kirmizi);
        add(yesil);
        add(mavi);
        add(siyah); 
    }
    
    public void Renk(String renk){
        
        String Metin = renk;
        
        JOptionPane.showMessageDialog(null, Metin, "Tıkladın",JOptionPane.INFORMATION_MESSAGE);
         
    }
    public static void main(String[] args) {
        
        FinalArayuz arayuz = new FinalArayuz();
         
         arayuz.setVisible(true);
    }
}
