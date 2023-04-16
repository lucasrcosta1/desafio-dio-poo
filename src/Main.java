import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main (String[] args) {
        Map<Integer, Curso> cursos = new LinkedHashMap<Integer, Curso>(){{
            put(0, new Curso(
                "Java para iniciantes",
                "Passo a passo das estuturas iniciais de programacao levando em conta a sintaxe da linguagem Java.",
                40
            ));
            put(1, new Curso(
                "JavaScript para iniciantes",
                "Ensino do basico de JavaScript.",
                20
            ));

        }};
        Map<Integer, Mentoria> mentorias = new LinkedHashMap<Integer, Mentoria>(){{
            put(0, new Mentoria(
                "Java para iniciantes",
                "Passo a passo das estuturas iniciais de programacao levando em conta a sintaxe da linguagem Java.",
                LocalDate.now()
            ));
            put(1, new Mentoria(
                "JavaScript para iniciantes",
                "Ensino do basico de JavaScript.",
                LocalDate.now()
            ));
        }};
        Main main = new Main();
        main._printCourse(cursos);
        main._printMentoring(mentorias);

    }

    private void _printCourse (Map<Integer, Curso> cursos) {
        for (Map.Entry<Integer,Curso> curso: cursos.entrySet()) {
            System.out.println("Curso: " + curso.getKey() + "\n" + curso.getValue());
        } 
    }

    private void _printMentoring (Map<Integer, Mentoria> mentorias) {
        for (Map.Entry<Integer,Mentoria> mentoria: mentorias.entrySet()) {
            System.out.println("Mentoria: " + mentoria.getKey() + "\n" + mentoria.getValue());
        } 
    }
}