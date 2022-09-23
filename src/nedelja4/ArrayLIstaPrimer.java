package nedelja4;

import java.util.ArrayList;

public class ArrayLIstaPrimer {
    public static void main(String[] args) {
        String[] niz = new String[2];
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Zdravo"); //0
        lista.add("ja");     //1
        lista.add("sam");   //2
        lista.add("Program");//3
        //lista.remove(2);
//        lista.add(0 , "Prvi element");
        //lista.replaceAll(element -> element.toUpperCase());
        lista.add(1, "Nesto");
        //lista.add(0, "Prvi element");


//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }

        for (String nekiString : lista) {
            System.out.println(nekiString);
        }
    }
}
