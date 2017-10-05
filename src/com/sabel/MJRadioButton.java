package com.sabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MJRadioButton extends JRadioButton {


    public MJRadioButton(String text) {
        super(text);
        initEvents();
    }

    private void initEvents() {

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("JRadio");
            }
        });

    }
}
