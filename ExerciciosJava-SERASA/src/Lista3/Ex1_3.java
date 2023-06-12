package Lista3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "Informe a velocidade do carro: ");
        int vel = scan.nextInt();

        if (vel > 80) {
            int multa = (vel - 80) * 5;
            JOptionPane.showMessageDialog(null, "Você será multado em R$" + multa);
        } else {
            JOptionPane.showMessageDialog(null, "Você não terá multa.");
        }
        scan.close();
    }
}
