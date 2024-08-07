package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;


    @Override /*Aqui tem a função de ser uma comparação por natureza que eu posso escolher no caso será*/
    public int compareTo(Pessoa p) {
        return Double.compare(altura, this.altura);
    }


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String toString(){
        return nome +" ( " + idade + "anos, " + altura + "m );";
    }


}



public class OrdenacaoDePessoas {


    public static void main(String[] args) {
        List<Pessoa> pessoa = new ArrayList<>();

        pessoa.add(new Pessoa("Maria Silva",28, 1.65));
        pessoa.add(new Pessoa("João Pereira", 35, 1.80));
        pessoa.add(new Pessoa("Ana Souza", 22, 1.70));
        pessoa.add(new Pessoa("Carlos Oliveira", 40, 1.75));
        pessoa.add(new Pessoa("Beatriz Santos", 30, 1.60));
        pessoa.add(new Pessoa("Pedro Lima", 25, 1.85));


        System.out.println("Ordenado por altura");
        Collections.sort(pessoa);
        for (Pessoa pessoa_altura : pessoa){
            System.out.println(pessoa_altura);

        }

        System.out.println("Ordenado por idade");
        ordenacao_por_idade ordem_idade =new ordenacao_por_idade();
        Collections.sort(pessoa, ordem_idade);

        for(Pessoa pessoa_idade : pessoa){
            System.out.println(pessoa_idade);

        }

    }

    static class ordenacao_por_idade implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            if (o1.getIdade() < o2.getIdade()) {
                return -1; /*vai para esquerda da lista*/
            }
            if (o1.getIdade() > o2.getIdade()){
                return 1;/*vai para direita da lista*/
            }
            else{
                return 0;
            }
        }
    }



}
