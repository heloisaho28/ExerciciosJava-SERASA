package Lista2;

public class Ex3_2 {

    public class Pessoa {

        private String nome;
        private String endereço;
        private double telefone;

        public Pessoa(String nome, String endereço, Double telefone) {
            this.nome = nome;
            this.endereço = endereço;
            this.telefone = telefone;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setEndereço(String endereço) {
            this.endereço = endereço;
        }

        public String getEndereço() {
            return endereço;
        }

        public void getTelefone(Double telefone) {
            this.telefone = telefone;
        }

        public double setTelefone(Double telefone) {
            return telefone;
        }
    }
}