package com.alexandermakunin;

import javax.swing.*;
import java.awt.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout FlowLayout");
        frame.setSize( 1024,768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        String[] cosas = new String[]{"jugar","dormir","comer","mirar videos","jugar con el gato"};
        Font[] font = new Font[]{
                new Font("Arial", Font.PLAIN, 16),
                new Font("Times New Roman", Font.BOLD, 18),
                new Font("Courier New", Font.ITALIC, 20),
                new Font("Verdana", Font.BOLD | Font.ITALIC, 22),
                new Font("Dialog", Font.PLAIN | Font.ITALIC,24)};
        Color[] colores = {
                new Color(255, 0, 0),
                new Color(0, 0, 255),
                new Color(0, 128, 0),
                new Color(255, 165, 0),
                new Color(128, 0, 128)
        };
        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel(cosas[i] + ", ");
            label.setFont(font[i]);
            label.setForeground(colores[i]);
            panel.add(label);
        }
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
