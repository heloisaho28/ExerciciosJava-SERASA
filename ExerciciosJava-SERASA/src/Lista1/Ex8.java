package Lista1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "Digite o valor em metros:");
        double metro = scan.nextDouble();

        double cm = metro*(100);
        double km = metro*(0.001);

        JOptionPane.showMessageDialog(null, "A distancia de "+metro+"m corresponde a: "+cm+"cm, "+km+"km.");

        scan.close();
        
    }
    
}