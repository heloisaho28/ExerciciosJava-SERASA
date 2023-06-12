package OObjetos.OObjetos1;

public class Carro_atributos {
  
    String modelo;
    String fabricante;
    String cor;
    int nportas;
    int potencia;
    double vmax;
    int nmarchas;
    boolean comarcondicionado;
    boolean ligado;
    boolean piscaalerta;
    boolean setadireita;
    boolean setaesquerda;

    public void liga(boolean ligado){
        if(ligado == false){
            this.ligado = true; 
            System.out.println("O carro está ligado.");
        }
    }

    public void desliga(boolean ligado){
        if(ligado == true){
            this.ligado = false;
            System.out.println("o carro está desligado.");
        }}
    


    public void arcondicionado_off(boolean comarcondicionado){
        if(comarcondicionado == true){
            this.comarcondicionado = false;
        }
    }

    public void arcondicionado_on(boolean comarcondicionado){
        if(comarcondicionado == false){
            this.comarcondicionado = true;
        }
    }

    
    public void ligaralerta(boolean piscaalerta){
        if(piscaalerta == false){
            this.piscaalerta = true;
        }
    }

}




    

