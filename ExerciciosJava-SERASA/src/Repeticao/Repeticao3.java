package Repeticao;

import java.util.Scanner;

public class Repeticao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        i=0;
        String nome;

        System.out.println("Insira seu nome:");
        nome = scan.nextLine();

        while(i<=10){
            i=i+1;
            System.out.println(nome);
        }
        scan.close();
    }
}