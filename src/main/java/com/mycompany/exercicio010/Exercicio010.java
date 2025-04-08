/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio010;

/**
 *
 * @author Fabricio de Aguiar
 */

/**Faça um programa em JAVA que solicite 2 números inteiros e efetue
a adição; caso o resultado seja maior que 10, apresentá-lo:*/

import javax.swing.JOptionPane;

public class Exercicio010 {

    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro: "));

        int soma = numero1 + numero2;

        if (soma > 10) {
            JOptionPane.showMessageDialog(null, "A soma dos números são: " + soma);

        }

    }
}
