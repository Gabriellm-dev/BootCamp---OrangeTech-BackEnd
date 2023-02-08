package collections.map;

import java.util.*;

public class ExemploOrdenacaoMap {
    /* Dadas as seguintes informações sobre meus livros favoritos e seus autores
    crie um dicionario e ordene este dicionario:
    exibindo (nome Autor - Nome Livro);

    Autor = Hawking, Stephen - Livro = nome: Uma breve História do Tempo. páginas: 256
    Autor = Duhigg, Charles - Livro = nome: O poder do Hábito, páginas: 408
    Autor = Harari, Yuval Noah - Livro = nome: 21 Lições para o Século 21, páginas: 432

     */

    public static void main(String[] args) {
        System.out.println("Ordem Aleatória: ");

        Map<String, Library> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Library("Uma breve História do Tempo", 256));
           put("Duhigg, Charles", new Library("O poder do Hábito", 408));
           put("Harari, Yuval Noah", new Library("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Library> library: meusLivros.entrySet())
         System.out.println(library.getKey() + " - " + library.getValue().getName());

        System.out.println("Ordem de inserção: ");
        Map<String, Library> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Library("Uma breve História do Tempo", 256));
            put("Duhigg, Charles", new Library("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Library("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Library> library: meusLivros1.entrySet())
            System.out.println(library.getKey() + " - " + library.getValue().getName());

        System.out.println("Ordem de Alfabetica: ");
        Map<String, Library> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Library> library: meusLivros2.entrySet())
            System.out.println(library.getKey() + " - " + library.getValue().getName());

        System.out.println("Ordem Alfabetica dos nomes dos livros: ");
        Set<Map.Entry<String, Library>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Library> library: meusLivros3)
            System.out.println(library.getKey() + " - " + library.getValue().getName());




    }
}



class Library {
    private String name;
    private Integer pages;

    public Library(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return name.equals(library.name) && pages.equals(library.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Library>>{

    @Override
    public int compare(Map.Entry<String, Library> l1, Map.Entry<String, Library> l2) {
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    }
}