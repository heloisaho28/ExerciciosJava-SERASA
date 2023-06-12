package Repeticao;

import java.util.Scanner;

public class Repeticao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, soma, n;
        soma = 0;
        n = 0;
        i = 0;

        while(i<10){
            i = i++;
            System.out.println("Insira um numero:");
            n = scan.nextInt();
            soma = soma + n;         
        }
        System.out.println("A soma é:"+ soma);
        scan.close();
    }
    
}