import br.com.dio.desafio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java e Javascript");
        bootcamp.setDescricao("Bootcamp com conteúdos de Java e Javascript");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());

        System.out.println("Progrediram.........");
        devCamila.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP João: " + devJoao.calcularTotalXp());

        System.out.println("Apenas Camila progrediu......");
        devCamila.progredir();
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP João: " + devJoao.calcularTotalXp());

        System.out.println("Camila progrediu uma vez e João progrediu duas vezes.......");
        devCamila.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP João: " + devJoao.calcularTotalXp());
    }
}
