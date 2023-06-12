package Lista1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "Primeira nota:");
        double nota1 = scan.nextDouble();

        JOptionPane.showInputDialog(null, "Segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null, "A média das notas" + nota1 + " e " + nota2+" é "+ media);

        scan.close();
    }
}