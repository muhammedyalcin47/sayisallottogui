package com.bilgeadam.sayisallotogui.ekran;

import com.bilgeadam.sayisallotogui.Sayisalİslem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SayisalLoto  extends JFrame{

    private JPanel jPnel1;
    private JLabel baslikLabel;
    private JTextField tf1;
    private JButton cevirButton;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;

    public SayisalLoto(){

        add(jPnel1);
        setTitle("SAYISAL LOTO v1.0");
        setSize(600,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        cevirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Sayisalİslem i̇slem = new Sayisalİslem();

                int[] sayilar = i̇slem.arrayDoldur();

                tf1.setText(String.valueOf(sayilar[0]));
                tf2.setText(String.valueOf(sayilar[1]));
                tf3.setText(String.valueOf(sayilar[2]));
                tf4.setText(String.valueOf(sayilar[3]));
                tf5.setText(String.valueOf(sayilar[4]));
                tf6.setText(String.valueOf(sayilar[5]));





            }
        });
    }
}
