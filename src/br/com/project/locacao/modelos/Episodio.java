package br.com.project.locacao.modelos;

import br.com.project.locacao.calculo.Classificacao;

public class Episodio implements Classificacao {
    private int nrEpisodio;
    private String nmEpisodio;
    private Series series;
    private int totalVisualizacoes;

    public int getNrEpisodio() {
        return nrEpisodio;
    }

    public void setNrEpisodio(int nrEpisodio) {
        this.nrEpisodio = nrEpisodio;
    }

    public String getNmEpisodio() {
        return nmEpisodio;
    }

    public void setNmEpisodio(String nmEpisodio) {
        this.nmEpisodio = nmEpisodio;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
