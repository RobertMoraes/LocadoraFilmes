import java.util.ArrayList;
import java.util.List;

public class Filmes {

    String nmFilme;
    String genero;
    String sinopse;
    String elenco;
    int duracao;
    int anoLancamento;
    boolean incluidoPlano;
    double avaliacao;
    double somaAvaliacoes;
    int totalAvaliacoes;

    public Filmes(String nmFilme, String genero, int duracao, int anoLancamento, boolean incluidoPlano) {
        this.nmFilme = nmFilme;
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
    }

    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nmFilme);
        System.out.println("Genero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Ano de lancamento: " + anoLancamento);

    }

    void avaliarFilmes(double avaliacao) {
        somaAvaliacoes += avaliacao;
        totalAvaliacoes++;
    }

    void exibirMedia() {
        System.out.println("Média das avaliações: " + Math.round((somaAvaliacoes / totalAvaliacoes)*100)/100.0);
    }

}
