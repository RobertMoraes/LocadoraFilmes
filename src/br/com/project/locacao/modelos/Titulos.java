package br.com.project.locacao.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulos implements Comparable<Titulos> {
    @SerializedName("Title")
    private final String nmTitulo;
    @SerializedName("Genre")
    private final String genero;
    @SerializedName("Plot")
    private String sinopse = null;
    @SerializedName("Actors")
    private String elenco = null;
    @SerializedName("Runtime")
    private final String duracao;
    @SerializedName("Year")
    private final String anoLancamento;

    private boolean incluidoPlano = false;

    private double avaliacao = 0;

    private double somaAvaliacoes;

    private int totalAvaliacoes;

    public Titulos(String nmTitulo, String genero, String duracao, String anoLancamento, boolean incluidoPlano) {
        this.nmTitulo = nmTitulo;
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
    }

    public Titulos(TituloOmdb tituloOmdb) {
        anoLancamento = tituloOmdb.Year();
        duracao = tituloOmdb.Runtime();
        genero = tituloOmdb.Genre();
        nmTitulo = tituloOmdb.title();
        sinopse = tituloOmdb.Plot();
        elenco = tituloOmdb.Actors();
    }

    public void avaliarFilmes(double avaliacao) {
        this.somaAvaliacoes += avaliacao;
        this.totalAvaliacoes++;
    }

    public void exibirMedia() {
        System.out.println("Média das avaliações: " + Math.round((somaAvaliacoes / totalAvaliacoes) * 100) / 100.0);
    }

    public int getDuracao() {
        return Integer.parseInt(duracao.split(" ")[0]) * 60;
    }

    public String getNmTitulo() {
        return nmTitulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public double getAvaliacao() {
        return avaliacao = somaAvaliacoes / totalAvaliacoes;
    }

    @Override
    public String toString() {
        return "Titulos{" +
                "Titulo='" + nmTitulo + '\'' +
                ", genero='" + genero + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", elenco='" + elenco + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }

    @Override
    public int compareTo(Titulos o) {
        return this.getNmTitulo().compareTo(o.getNmTitulo());
    }
}
