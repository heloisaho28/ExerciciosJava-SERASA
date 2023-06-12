package  Lista2;

public class Ex2_2 extends Ex1_2 {
    public class IngressoVIP extends Ingresso {
        private double valorAdicional;
    
        public IngressoVIP(double valor, double valorAdicional) {
            super(valor);
            this.valorAdicional = valorAdicional;
        }
    
        public double getValorAdicional() {
            return valorAdicional;
        }
    
        public void setValorAdicional(double valorAdicional) {
            this.valorAdicional = valorAdicional;
        }
    
        @Override
        public String toString() {
            return ("O Ingresso vip custa " + (super.getValor() + valorAdicional));
        }
    }
    
}