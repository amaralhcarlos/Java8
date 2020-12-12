import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Alura Online");
        palavras.add("Casa do Código");
        palavras.add("Caelum");

        //Forma antiga -> Java 7
        //Collections.sort(palavras, new ComparadorPorTamanho());

        //Forma nova -> Java 8+
        //Método sort na interface List é um DEFAULT METHOD
        palavras.sort(new ComparadorPorTamanho());

        //Forma Antiga
        /*for (String p : palavras) {
            System.out.println(p);
        }*/

        //Usando a interface Consumer
        palavras.forEach(new ImprimeNaLinha());

    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        if (s1.length() < s2.length()) {
            return -1;
        }

        if (s1.length() > s2.length()) {
            return 1;
        }

        return 0;
    }
}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
