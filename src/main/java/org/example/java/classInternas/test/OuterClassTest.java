package org.example.java.classInternas.test;

public class OuterClassTest {
    private String name = "Isaac lima";

    class Inner{
        public void printOuterClassAttribute()
        {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTest.this.name);//assim vc faz referencia this a class mae
        }
    }
    public static void main(String[] args) {
        //oq e class interna? Uma class dentro da outra


        //pra chamar uma class interna precisa chamar a principal

        OuterClassTest outerClass = new OuterClassTest();//class mae
        Inner inner = outerClass.new Inner();

        inner.printOuterClassAttribute();
    }
}
