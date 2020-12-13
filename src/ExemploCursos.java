import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }


}

public class ExemploCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        System.out.println("Todos os cursos");
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("*-----------------------------------------*");
        System.out.println("Cursos com número de alunos maior ou igual a 100");

        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .forEach(c -> System.out.println(c.getNome()));

        System.out.println("*-----------------------------------------*");
        System.out.println("Número de alunos nesses cursos");

        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);


        System.out.println("*-----------------------------------------*");
        System.out.println("Total de alunos nesses cursos");

        System.out.println(
                cursos.stream()
                        .filter(curso -> curso.getAlunos() >= 100)
                        .mapToInt(Curso::getAlunos)
                        .sum()
        );

    }

}
