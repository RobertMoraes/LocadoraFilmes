package br.com.project.locacao.calculo;

import br.com.project.locacao.modelos.Titulos;

public class CalculadoraTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluirTempo(Titulos titulos) {
        this.tempoTotal += titulos.getDuracao();
    }

}
