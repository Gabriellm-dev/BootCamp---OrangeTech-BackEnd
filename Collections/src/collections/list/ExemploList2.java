package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/* Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo:
      (nome - idade - cor)

  Gato 1 = nome: Jon, idade: 18, cor: preto
  Gato 2 = nome: Simba, idade: 6, cor: tigrado.
  Gato 3 = nome: Snow, idade: 12, cor: amarelo.

   */
public class ExemploList2 {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18, "Preto"));
            add(new Gato("Simba",6, "Tigrado"));
            add(new Gato("Snow",12, "Amarelo"));
        }};
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);
        System.out.println("");
        System.out.println("--\tOrdem Aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("");
        System.out.println("--\tOrdem Natural\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("");
        System.out.println("--\tOrdem Idade\t--");
        Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\tOrdem Cor\t--");
        Collections.sort(meusGatos, new ComparatorCor());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        System.out.println("");



    }
}

class Gato implements Comparable<Gato> {
    private String nome1;
    private Integer idade1;
    private String cor1;

    public Gato(String nome1, Integer idade1, String cor1) {
        this.nome1 = nome1;
        this.idade1 = idade1;
        this.cor1 = cor1;
    }

    public String getNome1() {
        return nome1;
    }

    public Integer getIdade1() {
        return idade1;
    }

    public String getCor1() {
        return cor1;
    }

    @Override
    public String toString() {
        return "Gatos: {" +
                "nome ='" + nome1 + '\'' +
                ", idade =" + idade1 +
                ", cor ='" + cor1 + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome1().compareToIgnoreCase(gato.getNome1());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade1(),g2.getIdade1());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor1().compareToIgnoreCase(g2.getCor1());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome1().compareToIgnoreCase(g2.getNome1());
        if (nome != 0) return nome;

        int cor = g1.getCor1().compareToIgnoreCase(g2.getCor1());
        if (cor != 0 ) return cor;

        return Integer.compare(g1.getIdade1(), g2.getIdade1());

    }
}
