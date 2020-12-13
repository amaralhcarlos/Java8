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
        palavras.add("Origamid");
        palavras.add("Caelum");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(palavra -> System.out.println(palavra));

    }
}