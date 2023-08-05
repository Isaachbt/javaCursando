package curso.java.maratonajava.introducao;

public class Aula27EstruturasCondicionaisExerciciosSwitch {
    public static void main(String[] args) {
        byte dia = 8;

        String diaRetornado = "";

        switch (dia){
            case 1:
                diaRetornado = "Domingo";
                break;
            case 2:
                diaRetornado = "Segunda";
                break;
            case 3:
                diaRetornado = "Terca";
                break;
            case 4:
                diaRetornado = "Quarta";
                break;
            case 5:
                diaRetornado = "Quinta";
                break;
            case 6:
                diaRetornado = "Sexta";
                break;
            case 7:
                diaRetornado = "Sabado";
                break;
            default:
                diaRetornado = "Opcao invalida!";
                break;
        }
        System.out.println(diaRetornado);
    }
}
