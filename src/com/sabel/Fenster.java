package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private MeinJPanel mjpNorth,mjpWest,mjpCenter,mjpEast,mjpSouth;
    private JPanel jpanel;


    public Fenster() {
        super("Layoutmanager");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
        this.setSize(400, 300);
        this.setVisible(true);
    }

    private void initComponents() {
        mjpNorth = new MeinJPanel("North");
        mjpWest = new MeinJPanel("West");
        mjpCenter = new MeinJPanel("Center");
        mjpEast = new MeinJPanel("East");
        mjpSouth = new MeinJPanel("South");

        jpanel = new JPanel();  // Standart = FlowLayout(FlowLayout.CENTER)
        jpanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30,50));

        for(int i = 0 ; i <5;i++) {
            jpanel.add(new JLabel("Text " + (i + 1)));
        }

        this.add(mjpNorth, BorderLayout.NORTH);
        this.add(mjpWest, BorderLayout.WEST);
        // this.add(mjpCenter, BorderLayout.CENTER);
        this.add(jpanel); // Default is Center
        this.add(mjpSouth, BorderLayout.SOUTH);
        this.add(mjpEast, BorderLayout.EAST);

    }

}
