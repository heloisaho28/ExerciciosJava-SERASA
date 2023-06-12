package Lista2;

public class Ex4_2  {

    public class Fornecedor extends Pessoa {
        private float valorCredito;
        private float valorDivida;
    }

    public Fornecedor(float valorCredito, float valorDivida){
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public float setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void getValorDivida(){
    
     return(valorDivida);
    }

    public void obterSaldo(float valorCredito , valorDivida){
        super.valorCredito -= valorDivida;
    }
    
}