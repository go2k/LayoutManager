package com.sabel;

import javax.swing.*;

public class MeinJPanel extends JPanel{

    private JLabel jlabel;

    public MeinJPanel(String text) {
        this.jlabel = new JLabel(text);
        // this.jlabel.setText(text);
        this.add(jlabel);
    }

}
