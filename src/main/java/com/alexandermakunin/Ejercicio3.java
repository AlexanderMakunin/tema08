package com.alexandermakunin;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola GUI");
        frame.setSize(480, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Bienvenido al mundo de las interfaces gráficas");
        label.setBounds(20,20,300,300);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
