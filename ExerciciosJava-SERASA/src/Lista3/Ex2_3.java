package Lista3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0;

        JOptionPane.showInputDialog(null, "Informe o ano de nascimento (aaaa):");
        int ano = scan.nextInt();
               

        while(ano>0){
            idade = 2023 - ano;
            if (idade>=18){
                JOptionPane.showMessageDialog(null,"Você nasceu em "+ano+", então é maior de idade.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Você nasceu em "+ano+", então é maior de idade.");
            }
        }
    scan.close();

    }
    
    
}