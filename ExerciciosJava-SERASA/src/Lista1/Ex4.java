package Lista1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "informe um numero:");
        int num_1 = scan.nextInt();

        JOptionPane.showInputDialog(null, "informe mais um numero:");
        int num_2 = scan.nextInt();

        int soma = num_1+num_2;
        
        JOptionPane.showMessageDialog(null, "A soma de "+num_1+"+"+num_2+ "="+soma+"." );
        scan.close();
    }    

    
}
