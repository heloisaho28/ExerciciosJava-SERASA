package Lista1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog(null, "Informe seu nome");

        JOptionPane.showInputDialog(null,"Informe seu salário:");
        double salario = scan.nextDouble();

        JOptionPane.showMessageDialog(null,"O salário de  " + nome +" é "+ salario + "reais mensais.");
        scan.close();
    }    
    
}
