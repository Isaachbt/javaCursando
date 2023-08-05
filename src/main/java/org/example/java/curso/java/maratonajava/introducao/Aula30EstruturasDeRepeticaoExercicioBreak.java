package curso.java.maratonajava.introducao;

public class Aula30EstruturasDeRepeticaoExercicioBreak {
    public static void main(String[] args) {

        //essa class simula um parcelamento em um valor total, e com seu valor minimo
        double valorTotal = 30000;

        for (int parcela = 1;parcela <= valorTotal;parcela++){
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+parcela+" R$"+valorParcela);
        }
    }
}
