package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxLayout extends JFrame {

    private JPanel jpSouth;
    private JPanel jpWest;
    private JPanel jpCenter;
    private JRadioButton jrRed;
    private JRadioButton jrBlue;
    private JRadioButton jrGreen;
    private ButtonGroup bgPanelWest;
    private Button btnGreen;
    private Button btnBlue;
    private Button btnRed;


    public static void main(String[] args) {
        new BoxLayout();
    }

    public BoxLayout() {
        super("Boxlayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
        this.initEvents();
        //this.setSize(300, 300);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {

        jpWest = new JPanel();
        jpWest.setLayout(new javax.swing.BoxLayout(jpWest, javax.swing.BoxLayout.Y_AXIS));
        jrBlue = new JRadioButton("Blau");
        jrGreen = new JRadioButton("Grün");
        jrRed = new JRadioButton("Rot");
        jrRed.setSelected(true);
        bgPanelWest = new ButtonGroup();
        bgPanelWest.add(jrRed);
        bgPanelWest.add(jrGreen);
        bgPanelWest.add(jrBlue);
        jpWest.add(jrRed);
        jpWest.add(jrGreen);
        jpWest.add(jrBlue);
        this.add(jpWest, BorderLayout.WEST);

        jpSouth = new JPanel();
        btnBlue = new Button("Blau");
        btnGreen = new Button("Grün");
        btnRed = new Button("Rot");
        jpSouth.add(btnRed);
        jpSouth.add(btnGreen);
        jpSouth.add(btnBlue);
        this.add(jpSouth, BorderLayout.SOUTH);

        jpCenter = new JPanel();
        jpCenter.setBackground(Color.RED);
        this.add(jpCenter, BorderLayout.CENTER);
    }

    private void initEvents() {

        jrRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setRed();
            }
        });

        jrGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setGreen();
            }
        });

        jrBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBlue();
            }
        });

        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setRed();
            }
        });

        btnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setGreen();
            }
        });

        btnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBlue();
            }
        });

    }

    private void setRed() {
        jrRed.setSelected(true);
        jpCenter.setBackground(Color.RED);
    }

    private void setBlue() {
        jrBlue.setSelected(true);
        jpCenter.setBackground(Color.BLUE);
    }

    private void setGreen() {
        jrGreen.setSelected(true);
        jpCenter.setBackground(Color.GREEN);
    }
}
