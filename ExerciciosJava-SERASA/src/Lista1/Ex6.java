package Lista1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = scan.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("O antecessor de "+num+ " é "+antecessor+" e o sucessor é "+sucessor);
        
        scan.close();
         }
    
}