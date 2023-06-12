package Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("Informe o valor em reais:");
        double real = scan.nextDouble();

        double dolar = real*(4.80);

        System.out.printf("O valor de R$"+df.format(real)+" equivale a $"+df.format(dolar)+".");

        scan.close();
    }
    
}