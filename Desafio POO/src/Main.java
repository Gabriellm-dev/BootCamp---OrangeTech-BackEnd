import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria do Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
      */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        System.out.println("-----------------------------------------");

        Dev devXael = new Dev();
        devXael.setNome("Xael");
        devXael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Xael: " + devXael.getConteudosInscritos());
        devXael.progredir();
        devXael.progredir();
        devXael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Xael: " + devXael.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Xael: " + devXael.getConteudosConcluidos());
        System.out.println("XP: " + devXael.calcularTotalXp());









    }
}