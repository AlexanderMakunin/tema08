package com.alexandermakunin;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego de Adivinar el Número");
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        Random random = new Random();
        int numRandom = random.nextInt(101); // Número entre 0 y 100
        final int[] intentos = {5}; // Usamos un array para modificar dentro del ActionListener

        JLabel labelIntentos = new JLabel("Intentos restantes: " + intentos[0]);
        JLabel introducirNum = new JLabel("Introduzca un número: ");
        JTextField zonaText = new JTextField(10);
        JButton button = new JButton("Comprobar");

        // Etiqueta para mostrar el resultado
        JLabel resultado = new JLabel("");

        button.addActionListener(e -> {
            // Verificamos si el usuario ingresó algo
            String texto = zonaText.getText();
            if (texto.isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Por favor, ingresa un número.");
                return;
            }

            try {
                int numeroIngresado = Integer.parseInt(texto);
                if (numeroIngresado == numRandom) {
                    resultado.setText("¡Ganaste! El número era " + numRandom);
                    resultado.setForeground(Color.GREEN);
                    button.setEnabled(false); // Desactivamos el botón
                } else {
                    intentos[0]--;
                    labelIntentos.setText("Intentos restantes: " + intentos[0]);
                    if (intentos[0] == 0) {
                        resultado.setText("¡Perdiste! El número era " + numRandom);
                        resultado.setForeground(Color.RED);
                        button.setEnabled(false);
                    } else {
                        resultado.setText(numeroIngresado < numRandom ? "El número es mayor" : "El número es menor");
                        resultado.setForeground(Color.ORANGE);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Ingresa un número válido.");
            }
        });

        // Agregar componentes al panel
        panel.add(labelIntentos);
        panel.add(introducirNum);
        panel.add(zonaText);
        panel.add(button);
        panel.add(resultado);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
