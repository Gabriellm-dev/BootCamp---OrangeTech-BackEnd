package collections.set;

    /*
        Dadas as seguintes informações sobre minhas series favoritas crie um conjunto
        e ordene este conjunto exibindo:
        (nome-genero-tempo de episodio)

        serie 1 = nome: got, genero: fantasia, tempoEpisodio: 60
        serie 2 = nome: dark, genero: drama, tempoEpisodio: 60
        serie 3 = nome: that, genero: comedia, tempoEpisodio: 25
     */

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Ordem Aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("thats", "comédia", 25));
        }};
        for (Serie serie: minhasSeries ) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());

        System.out.println(" ");

        System.out.println("Ordem de Inserção: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("thats", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());

        System.out.println(" ");

        System.out.println("Ordem Natural: ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());

        System.out.println(" ");

        System.out.println(" Ordem Nome/Gênero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());


    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer TempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        TempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return TempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", TempoEpisodio=" + TempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && TempoEpisodio.equals(serie.TempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, TempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());

    }
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}