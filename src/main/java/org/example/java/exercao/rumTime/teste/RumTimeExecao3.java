package exercao.rumTime.teste;

public class RumTimeExecao3 {
    public static void main(String[] args) {

        abrirConexao();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo arquivos");
            System.out.println("Escrevendo dados no arquivos");
            return "Conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
