package Lista3;

import java.util.Scanner;


public class Ex4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        // boolean entrada = true;
        
        System.out.println("Informe um número: ");
        num = scan.nextInt();
    
        if(num%2 == 0){
            System.out.println("O número "+num+" é par");
        }else{
            System.out.println("O número "+num+" é impar");
        }
        scan.close();
    }

}