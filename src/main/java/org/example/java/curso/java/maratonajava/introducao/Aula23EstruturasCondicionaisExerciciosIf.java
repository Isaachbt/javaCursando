package curso.java.maratonajava.introducao;

public class Aula23EstruturasCondicionaisExerciciosIf {
    public static void main(String[] args) {

        double salario = 5000.00;


        if (salario <= 2000){
            System.out.println("Ira pagar 9.70 de taxa");
        }else if (salario > 2000 && salario <= 3000){
            System.out.println("Ira pagar 37.35");
        }else{
            System.out.println("Ira pagar 49.50");
        }

    }
}
