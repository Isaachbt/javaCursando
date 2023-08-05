package interfaces;

public class FileLoader implements DataLoad,DataRemove{
    @Override
    public void loader() {
        System.out.println("Carregando arquivos");
    }

    @Override
    public void remove() {

    }
}
