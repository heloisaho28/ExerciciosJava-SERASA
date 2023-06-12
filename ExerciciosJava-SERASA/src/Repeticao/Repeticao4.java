package Repeticao;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n;
        i=1;
        n=0;
        String nome;

        System.out.println("Insira seu nome:");
        nome = scan.nextLine();

        System.out.println("Insira a quantidade de vezes:");
        n = scan.nextInt();

        while(i<=n){
            i = i+1;
          
            System.out.println(nome);
        }
     
        scan.close();
    }
    
}