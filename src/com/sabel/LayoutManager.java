package com.sabel;

import javax.swing.*;
import java.awt.*;

public class LayoutManager extends JFrame {


    public LayoutManager()  {
        this.setTitle("Layoutmanager");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.initComponents();
        //this.initEvents();
        this.setVisible(true);
    }

    private void initComponents()  {

        JPanel jpNorth = new JPanel();
        JPanel jpWest = new JPanel();
        JPanel jpCenter = new JPanel();
        JPanel jpEast = new JPanel();
        JPanel jpSouth = new JPanel();

        JLabel jlNorth = new JLabel("North");
        JLabel jlWest = new JLabel("West");
        JLabel jlCenter = new JLabel("Center");
        JLabel jlEast = new JLabel("East");
        JLabel jlSouth = new JLabel("South");

        jpNorth.add(jlNorth);   jpNorth.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jpWest.add(jlWest);   jpWest.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jpCenter.add(jlCenter);   jpCenter.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jpEast.add(jlEast);   jpEast.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jpSouth.add(jlSouth);   jpSouth.setBorder(BorderFactory.createDashedBorder(Color.BLACK));

        this.add(jpNorth, BorderLayout.NORTH);
        this.add(jpWest, BorderLayout.WEST);
        this.add(jpCenter, BorderLayout.CENTER);
        this.add(jpEast, BorderLayout.EAST);
        this.add(jpSouth, BorderLayout.SOUTH);

    }


}
