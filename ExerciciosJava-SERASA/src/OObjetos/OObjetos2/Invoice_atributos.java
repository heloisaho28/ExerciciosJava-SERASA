package OObjetos.OObjetos2;

import javax.lang.model.util.AbstractAnnotationValueVisitor14;

public class Invoice_atributos {
    private int item;
    private String descricaoitem;
    private int qte_item;
    private double valor_item;
    private double valor_total;
    

    public Invoice_atributos ( int item, String descricaoitem, int qte_item, double valor_item, double valor_total) {
        this.item = item;
        this.descricaoitem = descricaoitem;
        
            if(qtde_item <= 0){
                this.valor_item = 0;
                this.descricaoitem = "Não se aplica.";
                this.item = 0;
            }else{
                this.item = item;
                this.valor_item = valor_item;
                this.qtde_item = qtde_item;
                this.descricaoitem = descricaoitem;
            }
                        
        }

        public int getItem() {
            return item;
        }
        
        public void setItem(int item) {
            this.item = item;
        }
        
        public String getDescricaoItem() {
            return descricaoitem;
        }
        
        public void setDescricaoItem(String descricaoitem) {
            this.descricaoitem = descricaoitem;
        }
        
        public int getQtdeItem() {
            return qtde_item;
        }
        
        public void getQtdeItem(int qtde_item) {
            this.qtde_item = qtde_item;
        }
        
        public double getvalor_item() {
            return valor_item;
        }
        
        public void setvalor_item(double valor_item) {
            this.valor_item = valor_item;
        }
        
        public double getInvoiceAmount(){
        
            return getqtde_item() * getPrecoUnitarioItem();
        }
           
}
    