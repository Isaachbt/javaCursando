package org.example.java.estrutura_dados_e_algoritimos.estruturadados;

public class VetorGeneralizar {
    private Object[] elementos;
    private int tamanho;

    public VetorGeneralizar(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

//    public void adicionar(String elemento){
//       for (int i =0;i<this.elementos.length;i++){
//           if (this.elementos[i] == null){
//               this.elementos[i] = elemento;
//               break;
//           }
//       }
//    }
//    public void adicionar(String elemento) throws Exception {
//        if (this.tamanho <this.elementos.length) {
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        }else{
//            throw new Exception("Vetor já esta cheio.");
//        }
//    }
    public boolean adicionar(Object elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    public boolean adicionar(int posicao,Object elemento) {
        this.aumentaCapacidade();
        if (!(posicao >=0 && posicao < this.tamanho))
            throw new IllegalArgumentException("Posição invalida.");

        for (int i = this.tamanho-1;i>= posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }
    public void removerElemento(int posicao){
        if (!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição invalida ["+posicao+"] escolhe um desess ["+tamanho+"]");
        }
        for (int i = posicao;i< this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            // existe essa forma mais simplificada: System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            for (int i = 0; i<this.elementos.length; i++){//percorre o array
                elementosNovos[i] = this.elementos[i];//add itens do antigo array no novo
            }
            this.elementos = elementosNovos;//sobrescreve o antigo array recebendo novos dados;
        }
    }
    public Object busca(int posicao){
        if (!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição invalida ["+posicao+"] escolhe um desess ["+tamanho+"]");
        }
        return this.elementos[posicao];
    }
    //verificando se existe o elemetnto
    public int busca(Object elemento){
        for (int i = 0; i<this.elementos.length; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    public int tamanho(){
        return this.tamanho;
    }
    @Override
    public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("[");

            for (int i = 0;i<this.tamanho-1;i++){
                s.append(this.elementos[i]);
                s.append(", ");
            }
            if (this.tamanho>0){
                s.append(this.elementos[this.tamanho-1]);
            }
            s.append("]");

        return s.toString();
    }


}
