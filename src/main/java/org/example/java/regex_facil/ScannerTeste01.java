package regex_facil;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String txt = "Levi, Eren, Mikasa, armin, true, 200";
        String[] names = txt.split(",");
        for (String name : names){
            System.out.println(name);
        }

    }
}
