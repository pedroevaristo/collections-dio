package List;
import java.util.ArrayList;
import java.util.List;


class Livro{
    private String titulo;
    private String autor;
    private int ano_de_publicação;

    public Livro(String titulo, String autor, int ano_de_publicação) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_de_publicação = ano_de_publicação;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_de_publicação() {
        return ano_de_publicação;
    }

    public void setAno_de_publicação(int ano_de_publicação) {
        this.ano_de_publicação = ano_de_publicação;
    }

    @Override
    public String toString(){
        return "Título: "+titulo+"Autor"+autor+"Ano de publicação: "+ano_de_publicação;
    }

}

public class CatalagoDeLivros {
    public static void main(String[] args) {
        List<Livro> listLibrary = new ArrayList();
        listLibrary.add(new Livro("A Jornada da Lua", "Mariana Silva", 2020));
        listLibrary.add((new Livro("O Mistério do Vale", "Carlos Almeida", 2018)));
        listLibrary.add(new Livro("Segredos do Oceano", "Fernanda Oliveira", 2022));
        listLibrary.add(new Livro("Sombras da Montanha", "Ricardo Santos", 2019));
        listLibrary.add(new Livro("Aventura nas Estrelas", "Juliana Ferreira", 2021));


        int ano_inicio = 2021;
        int ano_fim = 2022;

        List<Livro> anos_publicacao = pesquisarPorIntervaloAnos(listLibrary, ano_inicio, ano_fim);

        String autor_livro ="Mariana Silva";

        List<Livro> pesquisar_por_autor = pesquisarPorAutor(listLibrary, autor_livro);

        String titulo_livro = "O Mistério do Vale";

        List<Livro> pesquisarPorTitulo = pesquisarPorAutor(listLibrary, autor_livro);


    }
    public static List<Livro> pesquisarPorIntervaloAnos(List<Livro> livros, int ano_inicio, int ano_final){
        List<Livro> ordenacao_livros_ano= new ArrayList<>();
        for(Livro livro_por_ano : livros){
            if(livro_por_ano.getAno_de_publicação() >= ano_inicio && livro_por_ano.getAno_de_publicação() <= ano_final){
                ordenacao_livros_ano.add(livro_por_ano);
            }

        }
        return ordenacao_livros_ano;
    }
    public static List<Livro> pesquisarPorAutor(List<Livro> livros, String nome_autor){
        List<Livro> procurar_por_autor = new ArrayList<>();
        for(Livro livro_autor : livros){
            if(livro_autor.getAutor().equalsIgnoreCase(nome_autor)){
                procurar_por_autor.add(livro_autor);
            }
        }
        return procurar_por_autor;
    }

    public static List<Livro> pesquisarPorTitulo(List<Livro> livros, String titulo){
        List<Livro> procurar_titulo_livro = new ArrayList<>();
        for (Livro titulo_livro : livros){
            if(titulo_livro.getTitulo().equalsIgnoreCase(titulo)){
                procurar_titulo_livro.add(titulo_livro);
            }
        }

        return procurar_titulo_livro;
    }


}
