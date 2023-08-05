package classInternas.test;

//exemplo
class Animal{
    public void walk()
    {
        System.out.println("Animal walking");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        //oq e class anonimas? são class q vai ser utilizada pelo curto tempo no codigo
        //e não pode ser reutilizada em nenhum outro local

        Animal animal = new Animal()
        {//criando uma subClass utilizando a propria class, class anonima sem nome
            // os dados vão ser diferente enquanto a referencia for usada, outra referencia não conta

            @Override
            public void walk() {
                //mudando o valor do metodo
                System.out.println("Gato walking");
            }
           //posso criar metodos aqui, mas vou usar so aqui dentro msm!
        };
        animal.walk();

    }
}
