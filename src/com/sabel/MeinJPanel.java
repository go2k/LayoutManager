package com.sabel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


public class MeinJPanel extends JPanel {

    private JLabel jlabel;
    private Random random;

    public MeinJPanel(String text) {
        this.jlabel = new JLabel(text);
        // this.jlabel.setText(text);
        random = new Random();

        this.setBorder(new TitledBorder(""));
        initEvents();
        this.add(jlabel);
    }

    private void initEvents() {
        MeinMouseListener mml = new MeinMouseListener();
        this.addMouseListener(mml);
    }

    private void getZufallsfarbe() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        this.setBackground(new Color(r, g, b));
        jlabel.setForeground(new Color(255 - r, 255 - g, 255 - b));
    }


    // Innere Klasse
    public class MeinMouseListener extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            getZufallsfarbe();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            getZufallsfarbe();
        }
    }


}
