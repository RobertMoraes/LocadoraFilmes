package br.com.project.locacao.modelos;

import br.com.project.locacao.calculo.Classificacao;

public class Series extends Titulos implements Classificacao {
    private int temporadas;
    private boolean ativa;
    private int epPorTemporada;
    private int minPorEpisodio;

    public Series(String nmTitulo, String genero, String duracao, String anoLancamento,
                  boolean incluidoPlano, int temporadas, int epPorTemporada, int minPorEpisodio) {
        super(nmTitulo, genero, duracao, anoLancamento, incluidoPlano);
        this.temporadas = temporadas;
        this.epPorTemporada = epPorTemporada;
        this.minPorEpisodio = minPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public int getMinPorEpisodio() {
        return minPorEpisodio;
    }

    public void setMinPorEpisodio(int minPorEpisodio) {
        this.minPorEpisodio = minPorEpisodio;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + getNmTitulo());
        System.out.println("Genero: " + getGenero());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Ano de lancamento: " + getAnoLancamento());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episodios por Temporada: " + getEpPorTemporada());
        System.out.println("Minutos por Episodio: " + getMinPorEpisodio());
    }

    @Override
    public int getDuracao() {
        return temporadas * epPorTemporada * minPorEpisodio;
    }

    @Override
    public double getClassificacao() {
        return super.getAvaliacao();
    }

    @Override
    public String toString() {
        return "Série: " + getNmTitulo() + " (" + getAnoLancamento() + ")";
    }
}
