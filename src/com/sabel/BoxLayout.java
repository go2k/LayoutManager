package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxLayout extends JFrame {

    private JPanel jpSouth;
    private JPanel jpWest;
    private JPanel jpCenter;
    private JRadioButton jrRot;
    private JRadioButton jrBlau;
    private JRadioButton jrGruen;
    private ButtonGroup bgPanelWest;
    private Button btnGruen;
    private Button btnBlau;
    private Button btnRot;


    public static void main(String[] args) {
        new BoxLayout();
    }

    public BoxLayout() {
        super("Boxlayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
        this.initEvents();
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {

        jpWest = new JPanel();
        jpWest.setLayout(new javax.swing.BoxLayout(jpWest, javax.swing.BoxLayout.Y_AXIS));
        jrBlau = new JRadioButton("Blau");
        jrGruen = new JRadioButton("Grün");
        jrRot = new JRadioButton("Rot");
        bgPanelWest = new ButtonGroup();
        bgPanelWest.add(jrRot);
        bgPanelWest.add(jrGruen);
        bgPanelWest.add(jrBlau);
        jpWest.add(jrRot);
        jpWest.add(jrGruen);
        jpWest.add(jrBlau);
        jrRot.setSelected(true);

        this.add(jpWest, BorderLayout.WEST);

        jpSouth = new JPanel();
        btnBlau = new Button("Blau");
        btnGruen = new Button("Grün");
        btnRot = new Button("Rot");
        jpSouth.add(btnRot);
        jpSouth.add(btnGruen);
        jpSouth.add(btnBlau);
        this.add(jpSouth, BorderLayout.SOUTH);

        jpCenter = new JPanel();
        jpCenter.setBackground(Color.RED);
        this.add(jpCenter, BorderLayout.CENTER);
    }

    private void initEvents() {

        jrRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setzeRot();
            }
        });

        jrGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setzeGruen();
            }
        });

        jrBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setzeBlau();
            }
        });

        btnRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jrRot.setSelected(true);
                setzeRot();
            }
        });

        btnGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jrGruen.setSelected(true);
                setzeGruen();
            }
        });

        btnBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jrBlau.setSelected(true);
                setzeBlau();
            }
        });

    }

    private void setzeRot() {
        jpCenter.setBackground(Color.RED);
    }

    private void setzeBlau() {
        jpCenter.setBackground(Color.BLUE);
    }

    private void setzeGruen() {
        jpCenter.setBackground(Color.GREEN);
    }
}
