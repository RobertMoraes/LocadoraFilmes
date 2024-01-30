package br.com.project.locacao.modelos;

public class Titulos {
    private final String nmTitulo;
    private final String genero;
    private final String sinopse = null;
    private final String elenco = null;
    private final int duracao;
    private final int anoLancamento;
    private final boolean incluidoPlano;
    private final double avaliacao = 0;
    private double somaAvaliacoes;

    private int totalAvaliacoes;

    public Titulos(String nmTitulo, String genero, int duracao, int anoLancamento, boolean incluidoPlano) {
        this.nmTitulo = nmTitulo;
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
    }

    public void avaliarFilmes(double avaliacao) {
        this.somaAvaliacoes += avaliacao;
        this.totalAvaliacoes++;
    }

    public void exibirMedia() {
        System.out.println("Média das avaliações: " + Math.round((somaAvaliacoes / totalAvaliacoes) * 100) / 100.0);
    }

    public int getDuracao() {
        return duracao;
    }

    public String getNmTitulo() {
        return nmTitulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

}
