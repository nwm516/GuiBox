package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // Initializes JFrame Object
        JFrame frame = new JFrame("GUI Box");

        // Initializes Box object
        Box guiBox = new Box(0, 0, 0);

        // Label creation for length, width, & height
        JLabel lengthLabel = new JLabel("Length");
        lengthLabel.setBounds(52, 50, 100, 30);
        frame.add(lengthLabel);

        JPanel lengthPanel = new JPanel();
        lengthPanel.setBounds(50, 50, 45, 30);
        lengthPanel.setBackground(Color.LIGHT_GRAY);
        frame.add(lengthPanel);

        JLabel widthLabel = new JLabel("Width");
        widthLabel.setBounds(55, 100, 100, 30);
        frame.add(widthLabel);

        JPanel widthPanel = new JPanel();
        widthPanel.setBounds(50, 100, 45, 30);
        widthPanel.setBackground(Color.LIGHT_GRAY);
        frame.add(widthPanel);

        JLabel heightLabel = new JLabel("Height");
        heightLabel.setBounds(55, 150, 100, 30);
        frame.add(heightLabel);

        JPanel heightPanel = new JPanel();
        heightPanel.setBounds(50, 150, 45, 30);
        heightPanel.setBackground(Color.LIGHT_GRAY);
        frame.add(heightPanel);

        // TextFields creation for each dimension of the box
        JTextField lengthText = new JTextField("Length");
        lengthText.setBounds(100, 50, 100, 30);
        frame.add(lengthText);

        JTextField widthText = new JTextField("Width");
        widthText.setBounds(100, 100, 100, 30);
        frame.add(widthText);

        JTextField heightText = new JTextField("Height");
        heightText.setBounds(100, 150, 100, 30);
        frame.add(heightText);

        // Calculate Volume button
        JButton calcVolume = new JButton("Calculate Volume");
        calcVolume.setBounds(50, 200, 200, 30);
        frame.add(calcVolume);

        // Calculate Surface Area button
        JButton calcSA = new JButton("Calculate Surface Area");
        calcSA.setBounds(50, 250, 200, 30);
        frame.add(calcSA);

        // Display Box Details button
        JButton boxDetails = new JButton("Display Box Details");
        boxDetails.setBounds(50, 300, 200, 30);
        frame.add(boxDetails);

        // Randomize Background Color button
        JButton randomColor = new JButton("Randomize Background Color");
        randomColor.setBounds(45, 400, 210, 30);
        frame.add(randomColor);

        // Calculate Volume ActionListener
        calcVolume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting values of text fields to Box object's various double values
                guiBox.setLength(Double.parseDouble(lengthText.getText()));
                guiBox.setWidth(Double.parseDouble(widthText.getText()));
                guiBox.setHeight(Double.parseDouble(heightText.getText()));

                // Calculating volume, placing it in a double
                double totalVolume = guiBox.getLength() * guiBox.getWidth() * guiBox.getHeight();

                JOptionPane.showMessageDialog(frame, "Total Volume of Box: " + totalVolume + " units");
            }
        });

        // Calculate Surface Area ActionListener
        calcSA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting values of text fields to Box object's various double values
                guiBox.setLength(Double.parseDouble(lengthText.getText()));
                guiBox.setWidth(Double.parseDouble(widthText.getText()));
                guiBox.setHeight(Double.parseDouble(heightText.getText()));

                // Calculating surface area, placing it in a double
                double surfaceArea = ((2 * (guiBox.getLength() * guiBox.getWidth())) + (2 * (guiBox.getWidth() * guiBox.getHeight()))
                        + (2 * (guiBox.getLength()* guiBox.getHeight())));

                JOptionPane.showMessageDialog(frame, "Surface Area of Box: " + surfaceArea + " units");
            }
        });

        // Display Box Details ActionListener
        boxDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting values of text fields to Box object's various double values
                guiBox.setLength(Double.parseDouble(lengthText.getText()));
                guiBox.setWidth(Double.parseDouble(widthText.getText()));
                guiBox.setHeight(Double.parseDouble(heightText.getText()));

                JOptionPane.showMessageDialog(frame, "Box Details:\nLength: " + guiBox.getLength() + " units\n"
                + "Width: " + guiBox.getWidth() + " units\n" + "Height: " + guiBox.getHeight() + " units");
            }
        });

        // Randomize Background Color ActionListener
        randomColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /*
                Color values are randomized from 0 - 255, affecting the RGB values
                to which the variables are assigned.
                 */

                int randomRed = (int)(0 + (Math.random() * 255));
                int randomGre = (int)(0 + (Math.random() * 255));
                int randomBlu = (int)(0 + (Math.random() * 255));

                frame.getContentPane().setBackground(new java.awt.Color(randomRed, randomGre, randomBlu));

            }
        });

        frame.setSize(300, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}