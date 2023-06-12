package Lista1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe um número:");
        double num =scan.nextDouble();

        double dobro = num*2;
        double terço = num/3;

        System.out.println("O dobro de "+num+ " é "+dobro+". A terça parte é "+terço);

        scan.close();
    }
    
}