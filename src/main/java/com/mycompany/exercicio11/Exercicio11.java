package com.mycompany.exercicio11;

import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        if ((numero % 2) == 0) {
            JOptionPane.showMessageDialog(null, "É multiplo de 2 ");

        } else {
            JOptionPane.showMessageDialog(null, "Não é multiplo de 2! ");
            
        }
    }
}
