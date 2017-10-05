package com.sabel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MeinJPanel extends JPanel{

    private JLabel jlabel;

    public MeinJPanel(String text) {
        this.jlabel = new JLabel(text);
        // this.jlabel.setText(text);
        this.setBorder(new TitledBorder(""));
        this.add(jlabel);
    }




}
