package org.example.java.estrutura_dados_e_algoritimos.estruturadados;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
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

    public boolean adicionar(String elemento) {
        if (this.tamanho <this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String busca(int posicao){
        if (!(posicao >=0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição invalida ["+posicao+"] escolhe um desess ["+tamanho+"]");
        }
        return this.elementos[posicao];
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
