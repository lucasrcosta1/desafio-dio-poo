import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoring;

public class Main {
    public static void main (String[] args) {
        Set<Course> cursos = new LinkedHashSet<Course>(){{
            add(new Course(
                "Java para iniciantes",
                "Passo a passo das estuturas iniciais de programacao levando em conta a sintaxe da linguagem Java.",
                40
            ));
            add(new Course(
                "JavaScript para iniciantes",
                "Ensino do basico de JavaScript.",
                20
            ));
        }};

        Set<Mentoring> mentorias = new LinkedHashSet<Mentoring>(){{
            add(new Mentoring(
                "Java para iniciantes",
                "Passo a passo das estuturas iniciais de programacao levando em conta a sintaxe da linguagem Java.",
                LocalDate.now()
            ));
            add(new Mentoring(
                "JavaScript para iniciantes",
                "Ensino do basico de JavaScript.",
                LocalDate.now()
            ));
        }};

        // Main main = new Main();
        // main._printCourse(cursos);
        // main._printMentoring(mentorias);

        //Creating Bootcamps:
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitle("Bootcamp java developer");
        bootcamp.setDescription("Descricao bootcamp java developer");
        for (Course course: cursos) {
            bootcamp.getContents().add(course);
        }
        for (Mentoring mentoria: mentorias) {
            bootcamp.getContents().add(mentoria);
        }

        Dev dev0 = new Dev();
        dev0.setName("Fulano");
        dev0.subscribeBootcamp(bootcamp);
        // main._subscribeDev(dev0, cursos, "Java para iniciantes");
        System.out.println("Conteudos Inscritos Fulano:\n" + dev0.getSubscribedContent() + "\n");
        dev0.progress();
        dev0.progress();
        System.out.println("\nConteudos Inscritos Fulano:\n" + dev0.getSubscribedContent());
        System.out.println("Conteudos Concluidos Fulano:\n" + dev0.getFinishedContent());
        System.out.println("XP: " + dev0.calculateTotalXp());

        System.out.println("====================");

        Dev dev1 = new Dev();
        dev1.setName("Ciclano");
        dev1.subscribeBootcamp(bootcamp);
        // main._subscribeDev(dev1, cursos, "JavaScript para iniciantes");
        System.out.println("Conteudos Inscritos Ciclano:\n" + dev1.getSubscribedContent() + "\n");
        dev1.progress();
        dev1.progress();
        dev1.progress();
        System.out.println("\nConteudos Inscritos Ciclano:\n" + dev1.getSubscribedContent());
        System.out.println("Conteudos Concluidos Cliclano:\n" + dev1.getFinishedContent());
        System.out.println("XP: " + dev1.calculateTotalXp());


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

    /**
     * Subscribe dev to a given course name.
     * @param dev
     * @param courseName
     */
    private void _subscribeDev (Dev dev, Set<Course> avaliableCourses, String courseName) {
        for (Course course: avaliableCourses){
            if (course.getTitle().equals("Java para iniciantes"))
                dev.getSubscribedContent().add(course);
        }
    }
}