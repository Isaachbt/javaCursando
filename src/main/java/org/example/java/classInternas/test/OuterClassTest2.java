package classInternas.test;

public class OuterClassTest2 {
    private static String name = "Isaac lima test 2";

    static void print()//metodo normal
    {
        //oq e class local? class dentro de um metodo
        class LocalClass
        {
            public void printLocal()
            {
                System.out.println(name);
            }
        }

        //essa e a forma de usar a class local
        //inicializar ela dentro do metodo

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
    print();
    }
}
