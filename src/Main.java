import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso01 = new Curso();
        curso01.setTitulo("Java");
        curso01.setDescricao("Curso Preparatório Java");
        curso01.setCargaHoraria(12);

        Curso curso02 = new Curso();
        curso02.setTitulo("Javascript");
        curso02.setDescricao("Curso Preparatório Javascript");
        curso02.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria1);
    }
}
