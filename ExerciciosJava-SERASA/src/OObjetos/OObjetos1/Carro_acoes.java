package OObjetos.OObjetos1;

public class Carro_acoes {
    public static void main(String[] args) {
        Carro_atributos meucarro = new Carro_atributos(); 
        meucarro.cor = "preto";
        meucarro.modelo = "Uno";
        meucarro.nmarchas = 5;
        meucarro.liga(false);
        
        System.out.println("Meu carro é um "+meucarro.modelo+" da cor "+meucarro.cor);


    }
    
}