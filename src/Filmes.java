public class Filmes {

    private final String nmFilme;
    private final String genero;
    private final String sinopse = null;
    private final String elenco = null;
    private final int duracao;
    private final int anoLancamento;
    private final boolean incluidoPlano;
    private final double avaliacao = 0;
    private double somaAvaliacoes;
    private int totalAvaliacoes;

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
        this.somaAvaliacoes += avaliacao;
        this.totalAvaliacoes++;
    }

    void exibirMedia() {
        System.out.println("Média das avaliações: " + Math.round((somaAvaliacoes / totalAvaliacoes)*100)/100.0);
    }

}
