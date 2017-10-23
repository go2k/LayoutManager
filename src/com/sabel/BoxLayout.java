package com.sabel;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BoxLayout extends JFrame {

    private JPanel jpNorth;
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
    private JComboBox jComboColor;


    public static void main(String[] args) {
        new BoxLayout();
    }

    public BoxLayout() {
        super("Boxlayout");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.initComponents();
        this.initEvents();
        this.setSize(300, 300);
        //this.pack();
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

        jpNorth = new JPanel();
        String[] items = {"Rot", "Grün", "Blau"};
        jComboColor = new JComboBox(items);
        //jComboColor.setPreferredSize(new Dimension(100,20));
        jComboColor.setPrototypeDisplayValue("XXXXXXXXXXXXXXX");
        jpNorth.add(jComboColor);
        this.add(jpNorth, BorderLayout.NORTH);
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

        jComboColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch ((String) jComboColor.getSelectedItem()) {
                    case "Rot":
                        setRed();
                        break;
                    case "Blau":
                        setBlue();
                        break;
                    case "Grün":
                        setGreen();
                        break;
                };
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dlgEnd();
            }
        });

    }

    private void setRed() {
        jrRed.setSelected(true);
        jpCenter.setBackground(Color.RED);
        jComboColor.setSelectedItem("Rot");
    }

    private void setBlue() {
        jrBlue.setSelected(true);
        jpCenter.setBackground(Color.BLUE);
        jComboColor.setSelectedItem("Blau");
    }

    private void setGreen() {
        jrGreen.setSelected(true);
        jpCenter.setBackground(Color.GREEN);
        jComboColor.setSelectedItem("Grün");
    }

    private void dlgEnd() {
        if (JOptionPane.showConfirmDialog(this, "Wollen Sie das Programm wirklich beenden?", "Programm Beenden", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    }

