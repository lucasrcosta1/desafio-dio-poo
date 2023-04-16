import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Mentoring;

public class Main {
    public static void main (String[] args) {
        Map<Integer, Course> cursos = new LinkedHashMap<Integer, Course>(){{
            put(0, new Course(
                "Java para iniciantes",
                "Passo a passo das estuturas iniciais de programacao levando em conta a sintaxe da linguagem Java.",
                40
            ));
            put(1, new Course(
                "JavaScript para iniciantes",
                "Ensino do basico de JavaScript.",
                20
            ));

        }};
        Map<Integer, Mentoring> mentorias = new LinkedHashMap<Integer, Mentoring>(){{
            put(0, new Mentoring(
                "Java para iniciantes",
                "Passo a passo das estuturas iniciais de programacao levando em conta a sintaxe da linguagem Java.",
                LocalDate.now()
            ));
            put(1, new Mentoring(
                "JavaScript para iniciantes",
                "Ensino do basico de JavaScript.",
                LocalDate.now()
            ));
        }};

        Main main = new Main();
        main._printCourse(cursos);
        main._printMentoring(mentorias);

        //Polimorfismo - Tudo o que tem dentro de Conteudo esta em Curso, mas nem tudo que esta em Curso tem em Conteudo.
        // Conteudo conteudo = new Curso();

    }

    /**
     * Print all courses.
     * @param cursos
     */
    private void _printCourse (Map<Integer, Course> cursos) {
        for (Map.Entry<Integer,Course> curso: cursos.entrySet()) {
            System.out.println("Curso: " + curso.getKey() + "\n" + curso.getValue());
        } 
    }

    /**
     * Print all mentorings.
     * @param cursos
     */
    private void _printMentoring (Map<Integer, Mentoring> mentorias) {
        for (Map.Entry<Integer,Mentoring> mentoria: mentorias.entrySet()) {
            System.out.println("Mentoria: " + mentoria.getKey() + "\n" + mentoria.getValue());
        } 
    }
}