package com.alexandermakunin;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola GUI");
        frame.setSize(480, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hola mundo");
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
