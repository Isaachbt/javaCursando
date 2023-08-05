package genericos.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Isaac");
        list.add("Net");

        for (String l : list)
        {
            System.out.println(l);
        }


    }
}
